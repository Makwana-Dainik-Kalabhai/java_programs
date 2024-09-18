package Pattern;

class Pattern1 {
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
    */
    static void pattern(int n) {

        if (n == 0) {
            return;
        }
        for (int i = 5; i >= n; i--) {
            System.out.print(" *");
        }
        System.out.println("");
        pattern(n - 1);
    }

    public static void main(String args[]) {

        /*
         * *
         * *
         * * *
         * * * *
         * * * * *
         * -_-_-_-_-_-_
         * -_-_-_-_-_
         * -_-_-_-_
         * -_-_-_
         * -_-_
         */

        for (int i = 0; i < 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("-_");
            }
            System.out.println("");
        }

        System.out.println("\n\nUsing Recursion");
        pattern(5);
        System.out.println("");
    }
}
