package hospital;

public abstract class Doctor {
    public String name, specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public abstract void bookAppointment();
}

class Appointment {
    private Doctor DS;

    Appointment(Doctor DS) {
        this.DS = DS;
    }

    void schedule() {
        System.out.println("\nName: "+DS.getName());
        System.out.println("Specialization: "+DS.getSpecialization());
        DS.bookAppointment();
    }
}