package DSA;

class InsertionSort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // ! 7 is on sorted position(index). start with 8
        // ? ***** 7, 8, 3, 1, 2 */
        // ? It-1) 7, 8, 3, 1, 2 */
        // * Create space for 3 on 0th index */
        // ? It-2) 3, 7, 8, 1, 2 */
        // * Create space for 1 on 0th index */
        // ? It-3) 1, 3, 7, 8, 2 */
        // * Create space for 2 on specified index(1)*/
        // ? It-4) 1, 2, 3, 7, 8 */

        // ! In insertion sort:- */
        // * half part is sorted & half part is unsorted */
        // * by default 0th index is already sorted */
        // * So we start with 1st index */

        for (int i = 1; i < arr.length; i++) {
            // * Compare ith ele. with previous each elements */
            int current = arr[i];
            // * We compare current with previous elements so we start with i-1 */
            int j = i - 1;

            // * We compare current with all prev elements */
            while (j >= 0 && current < arr[j]) {
                // * If current is less than prev, so we create space for current in prev
                // indexes */
                arr[j + 1] = arr[j];
                // * [j+1]th element will not remove because stored it in current variable. */
                j--;
            }
            // * Store current ele. to prev preffered index */
            arr[j + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
