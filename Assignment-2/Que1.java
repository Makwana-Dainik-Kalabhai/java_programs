package com.cafe;

import java.util.ArrayList;
import java.util.Scanner;

interface CoffeeOrder {
    void selectCoffee(String coffeeType);
    void selectSize(String size);
    void displayOrder();
    int getPrice();
}

class CafeOrder implements CoffeeOrder {
    String coffeeType;
    double price;

    ArrayList<ArrayList<Object>> Orders = new ArrayList<ArrayList<Object>>();


    public void selectCoffee(String coffeeType) {
        this.coffeeType = coffeeType;

        CafeOrder C1 = new CafeOrder();

        if(coffeeType == "Latte")
            this.price = 160;

        if(coffeeType == "Cappuccino")
            this.price = 260;

        if(coffeeType == "Caffè mocha")
            this.price = 200;

        if(coffeeType == "Espresso")
            this.price = 210;
            
        if(coffeeType == "Frappe")
            this.price = 250;

        if(coffeeType == "Americano")
            this.price = 170;
    }

    public void selectSize(String size) {
        ArrayList<Object> ind = new ArrayList<Object>();

        ind.add(this.coffeeType);
        ind.add(size);

        if(size=="small")
        {
            ind.add(this.price/2);
        }
        if(size=="medium")
        {
            ind.add(this.price/1.5);
        }
        if(size=="large") {
            ind.add(this.price);
        }
        Orders.add(ind);
    }

    public void displayOrder() {
        double total = 0;
        System.out.print("\n\nBill Details...\n------------------------------------");
        for(int i=0; i<Orders.size(); i++)
        {
            System.out.printf("\n%d) %s (%s): Rs.%.2f",i+1,Orders.get(i).get(0),Orders.get(i).get(1),Orders.get(i).get(2));
            total += (double)Orders.get(i).get(2);
        }
        System.out.println("\n\nTotal Payable Amount: Rs."+total+"\n");
    }
    public int getPrice() {
        return 0;
    }
}

class Que1 {
    static CafeOrder C = new CafeOrder();
    static Scanner S = new Scanner(System.in);

    static void chooseType()
    {
        while(true)
        {
            System.out.println("\nCoffee Types...");
            System.out.println("  1) Latte (Rs.160)");
            System.out.println("  2) Cappuccino (Rs.260)");
            System.out.println("  3) Caffè mocha (Rs.200)");
            System.out.println("  4) Espresso (Rs.210)");
            System.out.println("  5) Frappe (Rs.250)");
            System.out.println("  6) Americano (Rs.170)");
            System.out.println("  7) Exit");

            System.out.print("Choose Coffee Type: ");
            int choice = S.nextInt();

            switch(choice)
            {
                case 1:
                    C.selectCoffee("Latte");
                    chooseSize();
                    break;

                case 2:
                    C.selectCoffee("Cappuccino");
                    chooseSize();
                    break;

                case 3:
                    C.selectCoffee("Caffè mocha");
                    chooseSize();
                    break;

                case 4:
                    C.selectCoffee("Espresso");
                    chooseSize();
                    break;

                case 5:
                    C.selectCoffee("Frappe");
                    chooseSize();
                    break;

                case 6:
                    C.selectCoffee("Americano");
                    chooseSize();
                    break;
                
                default:
                    return;
            }
        }
    }

    static void chooseSize()
    {
        System.out.println("\nCoffee Sizes(By Default Large)...");
        System.out.printf("  1) Small (Rs.%.2f)",Math.ceil(C.price/2));
        System.out.printf("\n  2) Medium (Rs.%.2f)",Math.ceil(C.price/1.5));
        System.out.printf("\n  3) Large (Rs.%.2f)",C.price);
        System.out.print("\n\nChoose Coffee Size: ");
        int choice = S.nextInt();
        switch(choice)
        {
            case 1:
                C.selectSize("small");
                break;
            case 2:
                C.selectSize("medium");
                break;
            default:
                C.selectSize("large");
                break;
        }
    }

    public static void main(String args[])
    {   
        while(true)
        {
            System.out.println("\nChoices...");
            System.out.println("  1) Place an Order");
            System.out.println("  2) Display Bill");
            System.out.println("  3) Exit");
            System.out.print("Enter your Choice: ");
            int choice = S.nextInt();

            switch(choice)
            {
                case 1:
                    chooseType();
                    break;

                case 2:
                    try {
                        C.Orders.get(0);
                        C.displayOrder();
                        return;
                    }
                    catch(Exception e) {
                        System.out.println("***Please! Place Order First***");
                    }
                    break;

                default:
                    return;
            }
        }
    }
}