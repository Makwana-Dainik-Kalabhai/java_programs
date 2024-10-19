class Pattern6
{
    public static void main(String[] args)
    {
        int i, j, odd = 1, even = 2;

        for(i=0; i<6; i++)
        {
            for(j=i; j<6; j++)
            {
                System.out.print("   ");
            }
            for(j=0; j<=i; j++)
            {
                if(i%2==0)
                {
                    if(odd<10)
                    System.out.printf("  %d",odd);
                    else
                    System.out.printf(" %d",odd);
                    odd += 2;
                }
                if(i%2!=0)
                {
                    if(even<10)
                    System.out.printf("  %d",even);
                    else
                    System.out.printf(" %d",even);
                    even += 2;
                }
            }
            System.out.println();
        }
    }
}