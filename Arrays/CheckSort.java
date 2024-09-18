package Arrays;

import java.util.*;

class CheckSort {
    int[] arr = {3, 2, 1, 4, 7, 6, 8, 9};

    boolean checkSort(int[] arr, int n) {
        if(n==1 || n==0)
        {
            return true;
        }
        return arr[n-1]>=arr[n-2] && checkSort(arr, n-1);
    }
    public static void main(String args[])
    {
        CheckSort C = new CheckSort();

        System.out.println(C.checkSort(C.arr, C.arr.length));
        
    }
}