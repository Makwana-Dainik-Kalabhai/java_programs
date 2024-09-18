package Interface;
//! Rules:-
//* 1) Can't use static methods in interface
//* 2) Can't parent interface method using super keyword in inheritance

interface ParentInterface {
    default void DefaultMethod() {
        System.out.println("DefaultMethod() in Parent interface");
    }
    void ParentInterface1();
    void ParentInterface2();
}

interface ChildInterface extends ParentInterface {
    default void DefaultMethod() {
        System.out.println("\nDefaultMethod() in Child interface\n");
    }
    void ChildInterface1();
    void ChildInterface2();
}

class Inter_inheritance implements ChildInterface {
    public void ParentInterface1() {
        System.out.println("ParentInterface1()");
    }
    public void ParentInterface2() {
        System.out.println("ParentInterface2()\n");
    }
    public void ChildInterface1() {
        System.out.println("ChildInterface1()");
    }
    public void ChildInterface2() {
        System.out.println("ChildInterface2()\n");
    }

    public static void main(String args[]) {
        Inter_inheritance I1 = new Inter_inheritance();
        I1.DefaultMethod();
        I1.ParentInterface1();
        I1.ParentInterface2();
        I1.ChildInterface1();
        I1.ChildInterface2();
    }
}