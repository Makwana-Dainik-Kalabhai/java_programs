package Exception;

class ExtException extends Exception {
    ExtException(String str)
    {
        super(str);
    }
    @Override
    public String toString() {
        return super.toString() + ", toString() method";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ", getMessage() method";
    }
}

class ExcClass {
    public static void main(String[] args) {
        try {
            // throw new ArithmeticException("This is Arithmetic Exception");
            throw new ExtException("ExtExceptoin()");
        }
        //
        catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("\n"+e.toString());
            System.out.println("\n"+e.getMessage());
            System.out.println("\n"+e+"\n");
            e.printStackTrace();
            System.out.println("Finished catch block");
        }
    }
}