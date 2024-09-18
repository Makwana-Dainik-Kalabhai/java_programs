import java.util.*;

class Guess {
    static int count = 1;
    int ComGuess, UserGuess;

    Guess() {
        Random R1 = new Random();
        ComGuess = R1.nextInt(0, 100);
    }

    void takeUserInput(int UserGuess) {
        this.UserGuess = UserGuess;

        while (UserGuess != ComGuess) {
            if (UserGuess < ComGuess) {
                System.out.println("Your number is Smaller");
            }
            //
            else if (UserGuess > ComGuess) {
                System.out.println("Your number is Greater");
            }

            Scanner S1 = new Scanner(System.in);
            System.out.print("\nGuess the number again(0-100): ");
            UserGuess = S1.nextInt();
            S1.close();

            setChance();
        }
        getChance();
    }

    void setChance() {
        count++;
    }

    void getChance() {
        System.out.printf("Congratulations! You won in %d chances\n\n", count);
    }
}

class GuessNum {
    public static void main(String args[]) {
        Guess G1 = new Guess();

        System.out.print("Guess the number(0-100): ");
        Scanner S1 = new Scanner(System.in);
        G1.takeUserInput(S1.nextInt());
        S1.close();
    }
}
