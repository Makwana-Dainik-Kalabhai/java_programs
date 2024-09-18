package Que1;

class Vehicle {
    String name = "Bike";
    String manufacturer = "Hero";

    void startEngine() {
        System.out.println("\nVehicle's engine is started.");
    }
}

class Car extends Vehicle {
    int numDoors = 4;

    void honkHorn() {
        System.out.println("Car honking its horn");
    }
}

class SportsCar extends Car {
    int topSpeed = 360;

    void activateTurbo() {
        System.out.println("Activating the turbo mode of the sports car.");
    }
}

class MainProgram {
    public static void main(String args[]) {
        Vehicle V1 = new Vehicle();
        Car C1 = new Car();
        SportsCar S1 = new SportsCar();
        
        V1.startEngine();
        System.out.printf("Name and Manufacturer of the Vahicle is %s and %s\n\n",V1.name,V1.manufacturer);
        C1.honkHorn();
        System.out.printf("%d no. of doors are available in Car\n\n",C1.numDoors);
        S1.activateTurbo();
        System.out.printf("Top Speed of the Sports Car is %d\n\n",S1.topSpeed);

    }
}