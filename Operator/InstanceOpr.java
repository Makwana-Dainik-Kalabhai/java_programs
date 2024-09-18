package Operator;
class Parent {
}

class Child extends Parent {
}

class InstanceOpr {
    public static void main(String args[]) {
        Parent P1 = new Parent();
        Child C1 = new Child();

        Parent PC = new Child();

        System.out.println("\nP1 instanceof Parent: " + (P1 instanceof Parent));
        System.out.println("\nC1 instanceof Parent: " + (C1 instanceof Parent));
        System.out.println("\nP1 instanceof Child: " + (P1 instanceof Child));
        System.out.println("\nC1 instanceof Child: " + (C1 instanceof Child));
        System.out.println("\nPC instanceof Parent: " + (PC instanceof Parent));
        System.out.println("\nPC instanceof Child: " + (PC instanceof Child)+"\n");
    }
}
