package Arrays;
class ReverseArr {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("original Array...");
        for (int ele : arr) {
            System.out.print(" " + ele);
        }

        int temp;
        int mid = Math.floorDiv(arr.length, 2); // gives min value, where ceil gives max value

        for (int i = 0; i < mid; i++) {
            temp = arr[(arr.length) - i - 1];
            arr[(arr.length) - i - 1] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nReverse Array...");
        for (int ele : arr) {
            System.out.print(" " + ele);
        }

        System.out.printf("\n\nLength = %d\nCeil(5,2) = %d\nFloor(5,2) = %d", arr.length, Math.ceilDiv(arr.length, 2),
                Math.floorDiv(arr.length, 2));

                int max=0;

                for(int ele: arr) {
                    if(ele>max) {
                        max = ele;
                    }
                }
                System.out.println("\n\nMaximum from array = "+max);


                int min = Integer.MAX_VALUE;

                for(int ele: arr) {
                    if(ele<min) {
                        min = ele;
                    }
                }
                System.out.println("\nMinimum from array = "+min);
    }
}
