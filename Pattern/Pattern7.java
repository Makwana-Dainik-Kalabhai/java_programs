class Pattern7
{
    public static void main(String[] args)
    {
        int i, j, k=4;

        for(i=0; i<4; i++)
        {
            for(j=0; j<4; j++)
            {
                if(j>i)
                System.out.printf(" %d",k-i);
                else
                System.out.printf(" %d",k-j);
            }
            for(j=2; j>=0; j--)
            {
                if(j>i)
                System.out.printf(" %d",k-i);
                else
                System.out.printf(" %d",k-j);
            } 
            System.out.println();
        }
        for(i=2; i>=0; i--)
        {
            for(j=0; j<4; j++)
            {
                if(j>i)
                System.out.printf(" %d",k-i);
                else
                System.out.printf(" %d",k-j);
            }
            for(j=2; j>=0; j--)
            {
                if(j>i)
                System.out.printf(" %d",k-i);
                else
                System.out.printf(" %d",k-j);
            } 
            System.out.println();
        }
    }
}