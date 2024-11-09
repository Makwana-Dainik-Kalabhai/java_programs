package com.kiosk;

import java.util.Scanner;

interface DenominationHandler
{
    void FiveHundredHandler(long amount);
    void OneHundredHandler(long amount);
    void TenHandler(long amount);
    void FiveHandler(long amount);
}

class Kiosk implements DenominationHandler {
    static Kiosk K = new Kiosk();

    int fiveHundred = 0;
    int oneHundred = 0;
    int ten = 0;
    int five = 0;

    static long custNo;
    static long payAmount;
    int rem;

    Kiosk() {
    }

    Kiosk(long custNo, long payAmount)
    {
        this.custNo = custNo;
        this.payAmount = payAmount;

        K.FiveHundredHandler(payAmount);
    }

    public void FiveHundredHandler(long amount) {
        while(amount>=500)
        {
            amount -= 500;
            fiveHundred++;
        }
        K.OneHundredHandler(amount);
    }
    public void OneHundredHandler(long amount) {
        while(amount>=100)
        {
            amount -= 100;
            oneHundred++;
        }
        K.TenHandler(amount);
    }
    public void TenHandler(long amount) {
        while(amount>=10)
        {
            amount -= 10;
            ten++;
        }
        K.FiveHandler(amount);
    }
    public void FiveHandler(long amount) {
        while(amount>=5)
        {
            amount -= 5;
            five++;
        }
        this.rem = (int)amount;
        K.displayDetails();
    }
    public void displayDetails() {
        System.out.println("Your Bill Details...");
        System.out.println("\nCustomer Number: "+custNo);
        System.out.printf("\n500 * %d  :    Rs.%d",fiveHundred,fiveHundred*500);
        System.out.printf("\n100 * %d  :    Rs.%d",oneHundred,oneHundred*100);
        System.out.printf("\n10 * %d   :    Rs.%d",ten,ten*10);
        System.out.printf("\n5 * %d    :    Rs.%d",five,five*5);
        System.out.println("\nRemaining Amount: Rs."+rem);
        System.out.println("\nTotal Payable Amount: Rs."+payAmount+"\n");
    }
}

class Que2 {
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Customer Number: ");
        long custNo = S.nextLong();

        System.out.print("Enter Bill Amount: ");
        long amount = S.nextLong();

        Kiosk K1 = new Kiosk(custNo,amount);
    }
}