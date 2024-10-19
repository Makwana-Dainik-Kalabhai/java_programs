class Pattern8
{
    public static void main(String[] args)
    {
        int i, j;
        String str = "welcometozohocorporation";
        for(i=1; i<=str.length(); i++)
        {
            for(j=1; j<=str.length(); j++)
            {
                if(i==j)
                {
                    System.out.printf(" %c",str.charAt(i-1));
                }
                else if((i+j)==str.length())
                {
                    System.out.printf(" %c",str.charAt(str.length()-i-1));
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}