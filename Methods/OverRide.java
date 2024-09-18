package Methods;
class A {
    void method1() {
        System.out.println("\nmethod1() in class A");
    }
    void method2(int a) {
        System.out.println("\nmethod2(int a) in class A");
    }
}

class B extends A {
    @Override
    void method1() {
        System.out.println("\nmethod1() in class B");
    }
    void method2() {
        System.out.println("\nmethod2() in class B");
    }
}

class OverRide {
    public static void main(String args[]) {
        A a1 = new A();
        B b1 = new B();

        //You call method with which object, that class's method will be invoked
        b1.method1(); //Calls to method1 in class B
        a1.method1(); //Calls to method1 in class A

        b1.method2(10); //Calls to method1 in class A

        System.out.println("");
    }
}
