package Que7;

import java.util.*;

class GCD {
    public static void main(String args[]) {
        int num1, num2;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        num1 = S.nextInt();
        System.out.print("Enter the Number2: ");
        num2 = S.nextInt();

        int n1 = num1, n2 = num2;

        int gcd = 1;

        for (int i = 2; i < 10; i++) {
            while (n1 % i == 0 && n2 % i == 0) { 
                n1 /= i;
                n2 /= i;
                gcd *= i;
            }
        }
        System.out.printf("\nGCD(%d,%d) = %d", num1, num2, gcd);
    }
}
