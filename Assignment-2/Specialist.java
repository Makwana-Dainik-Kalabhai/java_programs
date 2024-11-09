package hospital.doctors;

import hospital.Doctor;

public class Specialist extends hospital.Doctor {
    private String expertise;

    public Specialist(String ...args) {
        super(args[0], args[1]);
        this.expertise = args[2];
    }

    public void bookAppointment() {
        System.out.println("Expertise: "+this.expertise);
        System.out.println("\nYour Appoitment is booked\n");
    }
}