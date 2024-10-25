import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args)
    {
        int i, j, k=0, n;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = S.nextInt();

        boolean con = true;


        for(i=0; i<n; i++)
        {
            if(i%2==0)
                con = true;
            for(j=0; j<=i; j++)
            {
                if(con) {
                    System.out.printf(" %c",(k+65));
                    con = false;
                }
                else {
                    System.out.printf(" %c",(k+97));
                    con = true;
                }
                k++;
            }
            System.out.println();
        }
    }
}