package hospital;
import hospital.doctors.Specialist;

public class Que4 {
    public static void main(String[] args) {
        Specialist S = new Specialist("Dr.Agrawal","Pathology","Pharmacist");   

        Appointment A = new Appointment(S);
        A.schedule();
    }
}