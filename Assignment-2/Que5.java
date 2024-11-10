import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    List<String> transactions = new ArrayList<String>();

    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.printf("***Rs.%.2f is Deposited Successfully***\n",amount);
            transactions.add("Deposited Rs."+amount+"\tBalance: Rs."+this.balance);
        }
        else {
            System.out.println("***Deposit amount must be greater than 0***\n");
        }
    }

    void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("***Withdrawn Amount must be greater than 0***\n");
        }
        else if(amount>this.balance) {
            System.out.println("***Insuficient Balance***\n");
        }
        else {
            this.balance -= amount;
            System.out.printf("\nRs.%.2f is Withdrawn Successfully\n",amount);
            transactions.add("Withdraw Rs."+amount+"\tBalance: Rs."+this.balance);
        }
    }

    void printMiniStatement() {
        System.out.println("\n\nAccount Holder Name: "+this.accountHolder);

        try {
            transactions.get(0);
            System.out.println("\n\tTransaction History");
            System.out.println("-------------------------------------------");
            for(int i=0; i<transactions.size(); i++) {
                System.out.printf(transactions.get(i)+"\n");
            }
        }
        catch(Exception e) {
            System.out.println("\n***No Transaction History***");
        }
    }

    double getBalance() {
        return this.balance;
    }
}

class Que5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("\nEnter Account Holder Name: ");
        String name = S.nextLine();

        double amount;

        BankAccount B = new BankAccount(name);
        
        while(true) {
            System.out.println("\nChoices...");
            System.out.println("1) Deposit Money");
            System.out.println("2) Withdraw Money");
            System.out.println("3) Check Balance");
            System.out.println("4) Print Mini Statement");
            System.out.println("-- Other to Exit");

            System.out.print("\nEnter your Choice: ");
            int choice = S.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("\nEnter the Amount to Deposit: ");
                    amount = S.nextDouble();
                    B.deposit(amount);
                    break;

                case 2:
                    System.out.print("\nEnter the Amount to Withdraw: ");
                    amount = S.nextDouble();
                    B.withdraw(amount);
                    break;

                case 3:
                    System.out.println("\nBalance: Rs."+B.getBalance()+"\n");
                    break;

                case 4:
                    B.printMiniStatement();
                    break;

                default:
                    return;
            }
        }
    }
}