import java.util.Scanner;

class LCM {
    public static void main(String[] args)
    {
        int num1, num2, n1, n2, mul=1, i;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = S.nextInt();
        System.out.print("Enter num2: ");
        num2 = S.nextInt();

        n1=num1;
        n2=num2;
        for(i=2; i<10; i++)
        {
            while(n1%i==0 || n2%i==0)
            {
              mul*=i;
              if(n1%i==0)
              n1 /= i;
              if(n2%i==0)
              n2 /= i;
            }
            //!You can
            //* (n1*n2)/gcd(n1,n2)
        }
        System.out.printf("\nLCM(%d,%d): %d",num1,num2,mul);
    }
}