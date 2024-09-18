//! Rules :-
//* 1) Can not use this() & super() in one constuctor
//* 2) Can not use multiple this() in one constructor
//* 3) Can not use this() & super() in method, only can use in constructor
//* 4) Can't modify final variable
//* 5) Can't override final method

class Parent {
    final int finVar = 10;

    Parent() {
        //* Can't modify final variable
        //* finVar++;
        System.out.println("Parent() finVar = "+finVar);
    }
    Parent(int n) {
        System.out.println("Parent(int n)");
    }

    final void finalMethod() {
        System.out.println("finalMethod() in Parent class");
    }
}

class Child extends Parent {
    Child() {
        super(10);
        System.out.println("Child()");
    }
    Child(int n)
    {
        this(10,20);
        System.out.println("Child(int n)");
    }
    Child(int a,int b)
    {
        System.out.println("Child(int a,int b)");
    }
    
    //* Can't call this() & super() in method
    void method() {
        // super();
        //* this(10);
    }
    
    //* Can't modify final method
    // void finalMethod() {
    //     System.out.println("finalMethod() in Child class");
    // }
}

class ThisSuper {
    public static void main(String[] args)
    {
        Child c = new Child(10);
        c.method();
        
        Parent p = new Parent();
        p.finalMethod();
    }
}