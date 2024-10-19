class BankAcc {
    int balance;

    BankAcc(int balance) {
        this.balance = balance;
    }

    synchronized void withdraw(int amount)
    {
        if(amount>balance)
        System.out.println("Insufficient Balanace");

        balance -= amount;
        System.out.println("Amount withdrawn: Rs."+amount+"\nBalance: Rs."+balance);

        try {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class MyAcc1 extends Thread
{
    BankAcc B;
    int amount;

    MyAcc1(BankAcc B, int amount)
    {
        this.B = B;
        this.amount = amount;
    }
    public void run()
    {
        B.withdraw(amount);
    }
}

public class BankAccEx
{
    public static void main (String args[])
    {
        BankAcc B1 = new BankAcc(1000);
        Thread T[] = new Thread[5];

        for(int i=0; i<5; i++)
        {
            T[i] = new MyAcc1(B1,200);
        }

        for(Thread Th: T)
        {
            try {
                Th.start();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}