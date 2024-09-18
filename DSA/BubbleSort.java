package DSA;

class BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // ! Time Complexity: O(n^2)

        // * Drag maximum element to the last index */
        for (int i = 0; i < arr.length - 1; i++) {
            // * We drag maximum ele. to the end so that */
            // * it will looping until j<arr.length-i-1 */

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
