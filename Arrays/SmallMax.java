package Arrays;

class SmallMax {
    public static void main(String[] args)
    {
        int[] arr = {15, 10, 20, 3, 30, 25, 21, 5};
        int small = arr[0];
        int max = 0;
        
        System.out.println("\nOriginal Array...");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }

        System.out.println("");
        for(int i=0; i<(arr.length/2); i++)
        {
            if(arr[i]<small)
            {
                small = arr[i];
            }
            if(arr[arr.length-i-1]<small) {
                small = arr[arr.length-i-1];
            }
        }

        System.out.println("\nSmallest = "+small);

        for(int i=0; i<(arr.length/2); i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[arr.length-i-1]>max) {
                max = arr[arr.length-i-1];
            }
        }
        System.out.println("\nMaximum = "+max);
    }
}
