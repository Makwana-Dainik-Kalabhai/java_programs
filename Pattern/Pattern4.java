class Pattern4 {
    public static void main(String[] args)
    {
        int i, j, k=1;

        for(i=1; i<=5; i++)
        {
            k=i;
            for(j=1; j<=5; j++)
            {
                if(k>5)
                {
                    k=1;
                }

                System.out.printf(" %d",k);
                k++;
            }
            System.out.printf("\n");
        }
    }
}