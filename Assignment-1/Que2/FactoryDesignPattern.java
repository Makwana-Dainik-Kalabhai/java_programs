package Que2;

import java.util.*;

abstract class Thali {
    private double price;

    Thali() {
        price = 0.0;
    }

    abstract void addSabji(double price);

    abstract void addDal(double price);

    abstract void addRice(double price);

    abstract void addRoti(double price);

    void makeThali() {
        System.out.println("\nVeg Thali will be ready in 30 minutes.\n");
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}

class GujaratiThali extends Thali {

    void addSabji(double price) {
        price += getPrice();
        setPrice(price);
    }

    void addDal(double price) {
        price += getPrice();
        setPrice(price);
    }

    void addRice(double price) {
        price += getPrice();
        setPrice(price);
    }

    void addRoti(double price) {
        price += getPrice();
        setPrice(price);
    }
}

class PunjabiThali extends Thali {

    void addSabji(double price) {
        price += getPrice();
        setPrice(price);
    }

    void addDal(double price) {
        price += getPrice();
        setPrice(price);
    }

    void addRice(double price) {
        price += getPrice();
        setPrice(price);
    }

    void addRoti(double price) {
        price += getPrice();
        setPrice(price);
    }
}

class FactoryDesignPattern {

    static void choices(double ...price) {
        System.out.println("\nChoices...");
        System.out.printf("1) Add Sabji (Rs.%d)\n", (int) price[0]);
        System.out.printf("2) Add Dal (Rs.%d)\n", (int) price[1]);
        System.out.printf("3) Add Rice (Rs.%d)\n", (int) price[2]);
        System.out.printf("4) Add Roti (Rs.%d)\n", (int) price[3]);
        System.out.printf("5) Complete Order\n");
        System.out.printf("6) Get Total Bill\n");
    }

    static void switchCase(Thali T, double... price) {
        choices(price);
        Scanner S = new Scanner(System.in);
        int choice;
        System.out.print("\nEnter your Choice: ");
        choice = S.nextInt();

        while (true) {
            switch (choice) {
                case 1:
                    T.addSabji(price[0]);
                    choices(price);
                    System.out.print("\nEnter your Choice: ");
                    choice = S.nextInt();
                    break;

                case 2:
                    T.addDal(price[1]);
                    choices(price);
                    System.out.print("\nEnter your Choice: ");
                    choice = S.nextInt();
                    break;

                case 3:
                    T.addRice(price[2]);
                    choices(price);
                    System.out.print("\nEnter your Choice: ");
                    choice = S.nextInt();
                    break;

                case 4:
                    T.addRoti(price[3]);
                    choices(price);
                    System.out.print("\nEnter your Choice: ");
                    choice = S.nextInt();
                    break;

                case 5:
                    T.makeThali();
                    choices(price);
                    System.out.print("\nEnter your Choice: ");
                    choice = S.nextInt();
                    break;

                case 6:
                    System.out.println("\nTotal Payable Amount = Rs." + T.getPrice() + "\n\n");
                    return;

                default:
                    break;
            }
        }
    }

    public static void main(String args[]) {

        Scanner S = new Scanner(System.in);
        System.out.print("Enter 1 for Gujarati Thali & 2 for Punjabi Thali: ");
        int choice = S.nextInt();

        switch (choice) {
            case 1:
                Thali G = new GujaratiThali();
                switchCase(G, 100, 60, 50, 20);
                break;

            case 2:
                Thali P = new PunjabiThali();
                switchCase(P, 120, 80, 70, 40);
                break;

            default:
                break;
        }
    }
}
