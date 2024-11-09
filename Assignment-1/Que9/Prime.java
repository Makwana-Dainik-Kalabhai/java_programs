// package Que9;

import java.util.*;

class Prime {

    boolean checkPrime(int num, int count) {
        if(count==1)
        {
            return true;
        }
        return (num%count==0)?false:checkPrime(num,count-1);
    }

    public static void main(String args[]) {
        Prime P = new Prime();

        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = S.nextInt();

        int count = (int) Math.sqrt(num);

        if (P.checkPrime(num, count)) {
            System.out.printf("\n%d is a Prime number.", num);
        } else {
            System.out.printf("\n%d is not a Prime number.", num);
        }
    }
}
