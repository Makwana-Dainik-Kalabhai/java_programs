import java.util.*;
class ArrHandling {
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 1, 5, 4, 3};
        System.out.println("Array Elements...");
        for(int e: arr)
        {
            System.out.print(e+" ,");
        }
        System.out.println("\n\nArrays.toString(arr): "+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("\nArrays.sort(arr): "+Arrays.toString(arr));

        System.out.println("\nArrays.binarySearch(arr, 3): "+Arrays.binarySearch(arr, 3));

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("\nArrays.copyOf(arr, arr.length): " + Arrays.toString(copyArr));

        Arrays.fill(arr, 10);
        System.out.println("\nArrays.fill(arr, 10): " + Arrays.toString(arr));
    }
}