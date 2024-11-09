package com.bank;

import java.util.Scanner;
import com.bank.exceptions.BankingException;

interface BankingOperations {

    void deposit(double amount) throws Exception;
    void withdraw(double amount) throws Exception;

    double getBalance();
}

class Account implements BankingOperations {
    private long accNo;
    private double balance;

    Account(long accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    long getAccNo() {
        return this.accNo;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) throws Exception {
        if(amount > 0) {
            this.balance += amount;
            System.out.printf("\n***Rs.%.2f Deposited Successfully***\n",amount);
            System.out.println("Balance: Rs."+this.balance);
        }
        else {
            throw new BankingException("***Deposit Amount is invalid***");
        }
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if(amount <= 0) {
            throw new BankingException("***Withdrawal Amount must be greater than 0***");
        }
        if(amount>this.balance) {
            throw new BankingException("***Insufficient Balance***");
        }
        else {
            this.balance -= amount;
            System.out.printf("\n***Rs.%.2f Withdraw Successfully***\n",amount);
            System.out.println("Balance: Rs."+this.balance);
        }
    }
}

class BankingSystem extends Account {
    BankingSystem(long accNo, double balance) {
        super(accNo, balance);
        System.out.println("Account created Successfully");
        System.out.println("Account Number: "+this.getAccNo());
    }
    void retrieveInfo() {
        System.out.println("Account Number: "+this.getAccNo());
        System.out.println("Balance: Rs."+this.getBalance());
    }
}

public class Que3 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        BankingSystem B[] = new BankingSystem[15];
        int index = 0;
        long accNo;
        double amount;
        boolean checkAcc = false;

        while(true) {
            System.out.println("\nChoices...");
            System.out.println("1) Create Account");
            System.out.println("2) Deposit Money");
            System.out.println("3) Withdraw Money");
            System.out.println("4) Retrieve Information");
            System.out.println("Other to Exit");

            System.out.print("\nEnter your choice: ");
            int choice = S.nextInt();

            switch(choice) {
                case 1:
                    if(index<15) {
                        accNo = (int)(Math.random()*111111111);
                        for(int i=0; i<index; i++) {
                            if(B[i].getAccNo() == accNo) {
                                accNo = (int)(Math.random()*111111111);
                            }
                        }
                        B[index] = new BankingSystem(accNo, 0);
                        index++;
                    }
                    else {
                        System.out.println("***You exceeded the maximum limit of account creation. So, You can't Create the Account***");
                    }
                    break;

                case 2:
                    System.out.print("\nEnter the Account Number: ");
                    accNo = S.nextLong();

                    for(int i=0; i<index; i++) {
                        if(B[i].getAccNo() == accNo) {
                            System.out.print("Enter the Amount which you want to deposit: ");
                            amount = S.nextDouble();
                            
                            try {
                                B[i].deposit(amount);
                            }
                            catch(Exception e)
                            {
                                System.out.println("\n"+e.getMessage());
                            }
                            
                            checkAcc = true;
                        }
                    }
                    if(!checkAcc) {
                        System.out.println("***Acount Number: "+accNo+" is not exist***");
                    }
                    checkAcc = false;
                    break;
                
                case 3:
                    System.out.print("\nEnter the Account Number: ");
                    accNo = S.nextLong();

                    for(int i=0; i<index; i++) {
                        if(B[i].getAccNo() == accNo && B[i].getBalance()>0) {
                            System.out.print("Enter the Amount which you want to withdraw: ");
                            amount = S.nextDouble();

                            try {
                                B[i].withdraw(amount);
                            }
                            catch(Exception e)
                            {
                                System.out.println("\n"+e.getMessage());
                            }

                            checkAcc = true;
                        }
                    }
                    if(!checkAcc) {
                        System.out.println("***Acount Number: "+accNo+" is not exist***");
                    }
                    checkAcc = false;
                    break;

                case 4:
                    System.out.print("\nEnter the Account Number: ");
                    accNo = S.nextLong();

                    for(int i=0; i<index; i++) {
                        if(B[i].getAccNo() == accNo) {
                            B[i].retrieveInfo();
                            checkAcc = true;
                        }
                    }
                    if(!checkAcc) {
                        System.out.println("***Acount Number: "+accNo+" is not exist***");
                    }
                    checkAcc = false;
                    break;
                
                default:
                    return;
            }
        }
    }
}