//! Rules:-
//! 1) You must add all abstract methods of the abstract class into its derive class
//! OR
//! 2) You need to make derive class to abstract


abstract class Base {
    void baseMethod() {
        System.out.println("\nbaseMethod()\n");
    }
    abstract void abstractMethod1(); //You must add this both abstract methods in derive class
    abstract void abstractMethod2();
}

class Derive1 extends Base {
    void abstractMethod1() {
        System.out.println("abstractMethod1() in Derive1 class");
    }
    void abstractMethod2() {
        System.out.println("abstractMethod2() in Derive1 class");
    }
}

class Derive2 extends Base {
    void abstractMethod1() {
        System.out.println("abstractMethod1() in Derive2 class\n");
    }
    void abstractMethod2() {
        System.out.println("abstractMethod2() in Derive2 class\n");
    }
}

class AbstractClass {
    public static void main(String args[]) {
        Derive1 D1 = new Derive1();
        Derive2 D2 = new Derive2();

        D2.baseMethod();
        D1.abstractMethod1();
        D2.abstractMethod1();

        D1.abstractMethod2();
        D2.abstractMethod2();
    }
}
