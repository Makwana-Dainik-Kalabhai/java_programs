//! Rules:-
//* 1) Static variable can be use in all methods
//* 2) But static method uses only static variable

class ParClass {
    String nonStaticStr = "Parent class"; 
    static String staticStr = "Parent class";
}

class ChildClass extends ParClass {
    ChildClass() {
        nonStaticStr = "MyClass constructor";
        staticStr = "MyClass constructor";

        System.out.println("\nnonStaticStr = "+nonStaticStr);
        System.out.println("staticStr = "+staticStr);
    }

    void nonStaticMethod() {
        nonStaticStr = "nonStaticMethod()";
        staticStr = "nonStaticMethod()";

        System.out.println("\nnonStaticStr = "+nonStaticStr);
        System.out.println("staticStr = "+staticStr);
    }

    static void staticMethod() {
        //! This is not possible
        //* nonStaticStr = "staticMethod()";
        //* System.out.println("\nnonStaticStr = "+nonStaticStr);

        staticStr = "staticMethod()";

        System.out.println("\nstaticStr = "+staticStr);
    }
}

class Static {
    public static void main(String[] args)
    {
        ChildClass c = new ChildClass();
        c.nonStaticMethod();
        c.staticMethod();
    }
}