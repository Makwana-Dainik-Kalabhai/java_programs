package Inheritance;

class Base {
    Base() {
        System.out.println("Base()");
    }
    Base(int a) {
        System.out.println("Base(int a)");
    }
    Base(int a, int b) {
        System.out.println("Base(int a, int b");
    }
}

class InterDerive extends Base{
    int interDerive = 10;

    InterDerive() {
        System.out.println("InterDerive()");
    }
    InterDerive(int a) {
        System.out.println("InterDerive(int a)");
    }
    InterDerive(int a, int b) {
        System.out.println("InterDerive(int a, int b)");
    }
}

class Derive extends InterDerive {
    Derive() {
        super(10);
        System.out.println("Derive()");
    }
    Derive(int a) {
        System.out.println("interDerive varible of super class: "+super.interDerive);
        System.out.println("Derive(int a)");
    }
    Derive(int a, int b) {
        super(10,20);
        System.out.println("Derive(int a, int b)");
    }
    Derive(int a, int b, int c) {
        super(10,20);
        System.out.println("Derive(int a, int b, int c)\n\n");
    }
}

class Super {
    public static void main(String args[]) {

        System.out.println("\n\n-----------Derive D1 = new Derive();super(10)--------------");
        Derive D1 = new Derive();
        
        System.out.println("\n-------------Derive D2 = new Derive(10)-------------");
        Derive D2 = new Derive(10);


        System.out.println("\n-------------Derive D3 = new Derive(10,20);super(10,20)--------------");
        Derive D3 = new Derive(10,20);


        System.out.println("\n------------Derive D4 = new Derive(10,20,30);super(10,20)--------------");
        Derive D4 = new Derive(10,20,30);
    }
}
