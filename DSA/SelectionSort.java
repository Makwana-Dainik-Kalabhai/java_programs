package DSA;
class SelectionSort {
    public static void main(String args[]) {

        //! Time Complexity: O(n^2)

        //* Select minimum element, then swap it to 0th index */

        //*        7, 8, 3, 1, 2*/
        //*It-1)   1, 8, 3, 7, 2*/
        //*It-2)   1, 2, 3, 7, 8*/
        //*It-3)   1, 2, 3, 7, 8*/
        
        int[] arr = { 7, 8, 2, 1, 3, 5, 1 };
        //1, 1,, 2, 3, 5, 7,
        int min;
        
        for (int i = 0; i <arr.length-1; i++) {
            min = i;
            // * We drag minimum ele. to the start so that */
            // * it will looping from i+1 */
            
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
