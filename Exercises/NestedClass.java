class Outer {
    int nonStaticOuter = 10;
    static int staticOuter = 20;

    Outer() {
        System.out.print("Outer()");
        Inner I = new Inner("Inner() calling from Outer class");
    }

    void incrementOuter() {
        nonStaticOuter++;
        staticOuter++;
        System.out.println("\nAfter inrement...");
        System.out.print("\tnonStaticOuter = "+nonStaticOuter);
        System.out.print("\tstaticOuter = "+staticOuter);
    }

    void outerMethod() {
        System.out.println("\nouterMethod()");
        System.out.print("\nBefore inrement...\n");
        System.out.print("\tnonStaticOuter = "+nonStaticOuter);
        System.out.print("\tstaticOuter = "+staticOuter);
    }

    // static Class
    class Inner {

        int nonStaticInner = 30;
        static int staticInner = 40;

        Inner() {
            System.out.print("\tInner()");
        }
        Inner(String str) {
            System.out.println("\n"+str);
        }

        void incrementInner() {
            nonStaticInner++;
            staticInner++;
            System.out.println("\nAfter inrement...");
            System.out.print("\tnonStaticInner = "+nonStaticInner);
            System.out.print("\tstaticInner = "+staticInner);
        }

        static void innerMethod() {
            System.out.println("\n\ninnerMethod()");
            System.out.print("\nBefore inrement...\n");
            // System.out.println("nonStaticInner = "+nonStaticInner);
            System.out.print("\tstaticInner = "+staticInner);
        }
    }
}

class NestedClass {
    public static void main(String[] args) {
        System.out.println("\n\n_________________(Object - 1)___________________");
        Outer O1 = new Outer();

        //* If Inner class is static
        // Outer.Inner I1 = new Outer.Inner();

        // * If Inner class is not static
        Outer.Inner I1 = O1.new Inner();

        O1.outerMethod();
        O1.incrementOuter();

        Outer.Inner.innerMethod();
        I1.incrementInner();

        System.out.println("\n\n_________________(Object - 2)___________________");
        Outer O2 = new Outer();
        Outer.Inner I2 = O2.new Inner();

        O2.outerMethod();
        O2.incrementOuter();

        Outer.Inner.innerMethod();
        I2.incrementInner();
    }
}