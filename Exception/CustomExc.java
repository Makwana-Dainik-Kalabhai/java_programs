class MyException extends Exception {
    MyException() {

    }
    MyException(String exc)
    {
        super(exc);
    }
    int divide(int a,int b) throws Exception {
        if(b==3)
        {
            throw new Exception("Can't divide by 3 in divide() method");
        }
        return a/b;
    }
}
class CustomExc {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 3;

        MyException m = new MyException();

        try {
            if(b==3)
            {
                throw new MyException("Can not divide by 3");
            }
            int c = a/b;
        }
        catch(Exception e)
        {
            System.out.println("\ne.getMessage(): "+e.getMessage());
        }

        try {
            m.divide(a, b);
            return;
        }
        catch(Exception e)
        {
            System.out.println("\ne.getMessage(): "+e.getMessage());
            System.out.println("\ne.toString(): "+e.toString());
        }

        
        //* If we write finally block after return statement, yet it will run finally
        finally {
            System.out.println("finally block in divide() method");
        }
    }
}