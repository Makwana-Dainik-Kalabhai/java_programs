package Exception;

class Finally {
    static int divide() {
        try {
            int a = 10;
            int b = 5;
            return a/b; // Here is return statement yet finally block will execute.
        }
        catch(Exception e) {
            System.out.println("Exception: "+e);
        }
        finally {
            System.out.println("Finally Block");
        }
        return 0;
    }    
    public static void main(String[] args) {
        System.out.println("Result = "+divide());
    }
}
