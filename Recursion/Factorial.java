package Recursion;
import java.util.Scanner;

public class Factorial {

    public int factWithRec(int num) {
        if (num == 1) {
            return 1;
        }
        return num* factWithRec (num - 1);
    }

    void factWitoutRec(int num) {
        int fact = 1;
        for(int i=num; i>1; i--) {
            fact *= i;
        }
        System.out.println("\nFactorial without recursion: " + fact);
    }

    public static void main(String args[]) {

        Factorial F1 = new Factorial();

        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = S1.nextInt();

        int fact = F1.factWithRec(num);
        System.out.println("\nFactorial using recursion: " + fact);

        F1.factWitoutRec(num);
    }
}
