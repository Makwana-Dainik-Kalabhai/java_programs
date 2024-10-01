import java.util.Scanner;

class Armstrong {
    int pow(int x, int n)
    {
        if(n==0)
          return 1;
        if(x==0)
          return 0;

        if(n%2==0)
            return pow(x, n/2)*pow(x, n/2);
        else
            return x*pow(x, n/2)*pow(x, n/2);
    }
    int calcLength(int x)
    {
        int count=0;

        while(x>0)
        {
            x/=10;
            count++;
        }
        return count;
    }
    boolean checkArm(int x)
    {
        int temp=x, n, rem, sum=0;
        n=calcLength(x);

        System.out.printf("\n(");
        while(temp>0)
        {
            rem = temp%10;
            sum = sum+(pow(rem,n));
            temp /= 10;
            series(rem,n);
        }
        System.out.printf("): %d",sum);
        if(sum==x)
          return true;
        
        return false;
    }

    void series(int rem,int n)
    {

        System.out.print("(");
        for(int i=0; i<n; i++)
        {
            System.out.printf("%d",rem);
            if(i<n-1)
            System.out.print("*");
        }
        System.out.print(")+");
    }
    public static void main(String[] args)
    {
        Armstrong A = new Armstrong();
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=S.nextInt();

        if(A.checkArm(n))
            System.out.printf("\n%d is an Armstrong number",n);
        else
            System.out.printf("\n%d is not an Armstrong number",n);
    }
}