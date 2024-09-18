import java.util.Scanner;

class Getgrade {
    public String name;
    int roll;
    float[] sub = new float[6];

    Getgrade() {
        return;
    }

    public void Getmarks(float marks, int i) {
        sub[i] = marks;
    }

    public void Printgrade() {
        System.out.println("Marks of " + name);
        float total = 0, per = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println(sub[i]);

            total += sub[i];
        }

        System.out.println("\nResult of " + name);
        System.out.println("\n\nTotal Marks = " + total);
        per = (total) / 5;
        System.out.println("Total Percentage = " + per);

        if (per >= 90 && per < 100) {
            System.out.println("You have A+ grade");
        } else if (per >= 80 && per < 90) {
            System.out.println("You have A grade");
        } else if (per >= 70 && per < 80) {
            System.out.println("You have A- grade");
        } else {
            System.out.println("You are failed");
        }
    }
}

class PrintGrade {
    public static void main(String args[]) {
        Getgrade G1[] = new Getgrade[6];
        Scanner S1[] = new Scanner[6];

        for (int st = 1; st <= 5; st++) {
            G1[st] = new Getgrade();
            S1[st] = new Scanner(System.in);

            System.out.println("\n\nData for Student[" + st + "]...");

            System.out.print("Enter the Name: ");
            G1[st].name = S1[st].nextLine();
            System.out.println("Enter the marks of 5 subjects");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Subject[" + i + "]: ");
                float marks = S1[st].nextFloat();
                G1[st].Getmarks(marks, i);
            }

            G1[st].Printgrade();
        }
    }
}
