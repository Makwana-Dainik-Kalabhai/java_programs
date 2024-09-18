package Maths;
import java.util.Scanner;

class KiloMile {
    public static void main(String args[]) {

        Scanner S1 = new Scanner(System.in);

        System.out.print("Enter the Kilometers: ");
        float kilo = S1.nextFloat();

        System.out.println("\nTotal miles of "+kilo+" km = "+((kilo*0.621371)/1)%2f);
    }
}
