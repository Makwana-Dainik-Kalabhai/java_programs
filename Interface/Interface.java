package Interface;
//! Rules:- (Interface is like abstract method)
//! Abstract class's some methods are abstract,but interface's all methods are abstract
//* 1) Not use class keyword, only use interface keyword
//* 2) use extends keyword in inheritance of base class. Where use implements keyword in inheritance of interface
//* 3) You can't inherite(extends) multiple base class into one derive class
//* 4) But you can inherite(implements) multiple interfaces into one derive class
//*    (Because it is used in the place of multiple inheritance)
//* 5) In Advance, You can use extends & implements in one class like
//* class Derive extends Base implements inter(interface)
//* 6) If you define block of method it will generate an error.
//* 7) You can't use constructor in abstract class & interface
//* 8) you can't modify property of interface generates an error.(Because it is final variable)
//* 9) You can't use static methods in interface.


abstract class AbstractBaseClass {
    int abstractProperty = 10;

    abstract void abstractMethod();
}

interface Interface1 {
    int inter1Var = 20;
    
    void inter1Method1();
    void inter1Method2();

    void sameMethod();
    //You can use same methods in multiple interfaces, but it executes code written in derive class
}

interface Interface2 {
    void inter2Method1();
    void inter2Method2();


    void sameMethod();
}


class Derive extends AbstractBaseClass implements Interface1,Interface2 {
    
    Derive() {
        //This is not posible, iterface make its all variables & methods to static
        // inter1Var = 40;
    }

    void abstractMethod() {
        System.out.println("  abstractMethod() in AbstractBaseClass");
    }

    public void inter1Method1() {
        System.out.println("  inter1Method1() in Interface1");
    }
    public void inter1Method2() {
        System.out.println("  inter1Method2() in Interface1");
    }


    public void inter2Method1() {
        System.out.println("  inter2Method1() in Interface2");
    }
    public void inter2Method2() {
        System.out.println("  inter2Method2() in Interface2");
    }
    
    public void sameMethod() {
        System.out.println("  sameMethod() in Interface1 & Interface2\n");
    }
}

class Interface {
    public static void main(String args[]) {
        Derive D1 = new Derive();
        
        System.out.println("\nAbstract Class...");
        System.out.println("  abstractProperty = "+D1.abstractProperty);
        D1.abstractMethod();
        
        System.out.println("\nInterface1...");
        System.out.println("  inter1Pro = "+D1.inter1Var);
        D1.inter1Method1();
        D1.inter1Method2();
        D1.sameMethod();
        
        
        System.out.println("Interface2...");
        D1.inter2Method1();
        D1.inter2Method2();
        D1.sameMethod();
    }
}