package Pattern;

/* 1.  2.  3.
1. *
2.     *
3.         *
4.     *
5. *
6.     *
7.         *
8.     *
9. *
*/

class Pattern2 {

    void printPattern2(int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int i = 3; i >0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Pattern2 P2 = new Pattern2();

        P2.printPattern2(3);
    }
}
