package Exception;

class MyException extends Exception {
    @Override
    //! You must define it public
    public String toString() {
        return "Radius cann't be negative in toString()";
    }
    public String getMessage() {
        return "Radius cann't be negative in getMessage()";
    }
}

class Throws {
    static double area(double r) throws Exception {
        if(r<0)
        {
            throw new MyException();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args)
    {
        try {
            System.out.println("Area = " + area(6));
            System.out.println("Area = " + area(-6));
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
