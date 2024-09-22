package Que6;

class Pattern {
    public static void main(String args[]) {
        // *   00 01 02 03 04 05 06 07 08 09 010 011 012 */
        // ?00  7  7  7  7  7  7  7  7  7  7  7   7   7 */
        // ?10  7  6  6  6  6  6  6  6  6  6  6   6   7 */
        // ?20  7  6  5  5  5  5  5  5  5  5  5   6   7 */
        // ?30  7  6  5  4  4  4  4  4  4  4  5   6   7 */
        // ?40  7  6  5  4  3  3  3  3  3  4  5   6   7 */
        // ?50  7  6  5  4  3  2  2  2  3  4  5   6   7 */
        // ?60  7  6  5  4  3  2  1  2  3  4  5   6   7 */
        // ?70  7  6  5  4  3  2  2  2  3  4  5   6   7 */
        // ?80  7  6  5  4  3  3  3  3  3  4  5   6   7 */
        // ?90  7  6  5  4  4  4  4  4  4  4  5   6   7 */
        // ?100 7  6  5  5  5  5  5  5  5  5  5   6   7 */
        // ?110 7  6  6  6  6  6  6  6  6  6  6   6   7 */
        // ?120 7  7  7  7  7  7  7  7  7  7  7   7   7 */

        int k = 8;

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (j > i) {
                    System.out.print(" " + (k - i));
                } else {
                    System.out.print(" " + (k - j));
                }
            }
            for (int j = 7; j >0; j--) {
                if (j > i) {
                    System.out.print(" " + (k - i));
                } else {
                    System.out.print(" " + (k - j));
                }
            }
            System.out.println("");
        }
        
        k = 8;
        for (int i = 7; i >0; i--) {
            for (int j = 1; j < 7; j++) {
                if (j > i) {
                    System.out.print(" " + (k - i));
                } else {
                    System.out.print(" " + (k - j));
                }
            }
            for (int j = 7; j >0; j--) {
                if (j > i) {
                    System.out.print(" " + (k - i));
                } else {
                    System.out.print(" " + (k - j));
                }
            }
            System.out.println("");
        }
    }
}