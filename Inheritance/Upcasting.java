package Inheritance;
//! Most it used in runtime Polymorphism
class Phone {
    void phoneMethod() {
        System.out.println("phoneMethod()");
    }
    void name() {
        System.out.println("Phone");
    }
}
class SmartPhone extends Phone {
    void smartPhoneMethod() {
        System.out.println("smartPhoneMethod()");
    }
    void name() {
        System.out.println("SmartPhone");
    }
}

class Upcasting {
    public static void main(String args[]) {

        //! Super s = new Sub(); Right
        //Can't create SmartPhone S1 = new Phone();
        //1) Super class can refernce to subclass
        //2) But Subclass can't reference to super class
        //Because SmartPhone != Nokia Phone


        // Phone P1 is Referenced to SmartPhone object
        Phone P1 = new SmartPhone();


        P1.name(); //If method override, then calls to method of Sub Class
        P1.phoneMethod(); //If method isn't override, then calls to method of Super Class
        
        //P1.smartPhoneMethod();  If method isn't override, then you can't call to method of Sub Class
        //It calls to name() in SmartPhone class, because P1 is referenced of SmartPhone class
    }
}
