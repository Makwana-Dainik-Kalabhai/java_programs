package Methods;
class OverLoadMethods {
    void method() {
        System.out.println("\n1) method()");
    }
    
    //! Formal Parameter
    void method(int i) {
        System.out.println("2) method(int i)");
    }
    void method(float f) {
        System.out.println("3) method(float f)");
    }
    void method(double d) {
        System.out.println("4) method(double d)");
    }
    void method(int i, float f) {
        System.out.println("5) method(int i, float f)");
    }
    void method(float f, int i) {
        System.out.println("6) method(float f, int i)");
    }
    
    //! Variable Arguments
    void method(double ...arr) {
        System.out.println("7) method(double ...arr)\n\n");
    }
}

class OverLoad {
    public static void main(String args[]) {
        OverLoadMethods M1 = new OverLoadMethods();
        
        int i = 10;
        float f = 10.10f;
        double d = 10.10;
        
        M1.method();
        //If default method is not created,then it calls to variable argument method

        //! Actual Parameter OR Actual Arguments
        M1.method(i);
        M1.method(f);
        M1.method(d);
        M1.method(i, f);
        M1.method(f, i);

        //! Variable Arguments
        M1.method(i, f, d, 10, 20); 
        // 1) If any argument is not passed,then also calls to variable argument method
        // 2) If method definition have int in parameter,then can't pass different types in method call
    }
}
