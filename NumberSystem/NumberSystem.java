package NumberSystem;

import java.util.*;

class BinaryDecimal {

    //Ex:- Binary(1001)2 = (1*2*2*2) + (0*2*2) +(0*2) + (1*1) = (9)10
    int binaryToDecimal(int n) {
        int mul = 1;
        int decimal = 0;

        while(n>0)
        {
            int rem = n%10;
            decimal += (rem*mul);
            n /= 10;
            mul *= 2;
        }
        return decimal;
    }

    //Ex:- Decimal(9)10 = 9%2=1, 4%2=0, 2%2=0, 1 = (1001)2
    int decimalToBinary(int n) {
        int mul = 1;
        int binary = 0;

        while(n>0)
        {
            int rem = n%2;
            binary += rem*mul;
            n /= 2;
            mul *= 10;
        }
        return binary;
    }
}

class OctalDecimal {

    //Ex:- Octal(121)8 = (1*8*8) + (2*8) + (1*1) = (81)10
    int octalToDecimal(int n) {
        int mul = 1;
        int decimal = 0;

        while(n>0)
        {
            int rem = n%10;
            decimal += (rem*mul);
            n /= 10;
            mul *= 8;
        }
        return decimal;
    }

    //Ex:- Decimal(81)10 = 81%8=1, 10%8=2, 1 =(121)8
    int decimalToOctal(int n) {
        int mul = 1;
        int binary = 0;

        while(n>0)
        {
            int rem = n%8;
            binary += rem*mul;
            n /= 8;
            mul *= 10;
        }
        return binary;
    }
}

class HexaDecimal {

    //Ex:- Hexa(1F2) = (1*16*16*16) + (15*16*16) + (2*1) = (498)16
    int hexaToDecimal(String n)
    {
        int decimal = 0;
        int mul = 1;

        for(int i=n.length()-1; i>=0; i--)
        {
            if((n.charAt(i)-'0')>=1 && (n.charAt(i)-'0')<=9)
            {
                decimal += (n.charAt(i)-'0')*mul;
            }
            else {
                decimal += (n.charAt(i)-'A'+10)*mul;
            }
            mul *= 16;
        }
        return decimal;
    }

    StringBuilder decimalToHexa(int n) {
        StringBuilder hexa = new StringBuilder("");

        while(n>0)
        {
            int rem = n%16;

            if(rem>=0 && rem<=9)
            {
                hexa.insert(0,rem);
            }
            else {
                hexa.insert(0,(char) (55+rem));
            }
            n /= 16;
        }
        return hexa;
    }
}

class NumberSystem {

    public static void main(String[] args)
    {

        BinaryDecimal BD = new BinaryDecimal();
        System.out.println("\nBinary(1100) to Decimal = "+BD.binaryToDecimal(1100));
        System.out.println("Decimal(12) to Binary = "+BD.decimalToBinary(12));
        System.out.println("____________________________________");

        OctalDecimal OD = new OctalDecimal();
        System.out.println("Octal(412) to Decimal = "+OD.octalToDecimal(412));
        System.out.println("Decimal(266) to Octal = "+OD.decimalToOctal(266));
        System.out.println("____________________________________");

        HexaDecimal HD = new HexaDecimal();
        System.out.println("Hexadecimal(1F2) to Decimal = "+HD.hexaToDecimal("1F2"));
        System.out.println("Decimal(498) to Hexadecimal = "+HD.decimalToHexa(498));
        System.out.println("____________________________________\n");
    }
}