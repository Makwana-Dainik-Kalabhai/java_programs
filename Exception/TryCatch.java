package Exception;

class TryCatch {
    public static void main(String[] args)
    {
        int a = 5;
        
        for(int i=4; i>=0; i--)
        {
            try {
                int result = a/i;
                System.out.println("Result = "+result);
            }
            catch(Exception e)
            {
                System.out.println("Exception = "+e);
            }
        }
    }    
}