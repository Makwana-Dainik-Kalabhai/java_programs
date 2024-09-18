package Arrays;

class SortArr {
    public static void main(String args[]) {
        int[] arr = { 4, 3, 35, 20, 45, 25, 10, 15, 50, 40, 30, 22, 19, 2, 55, 47, 30 };
        System.out.println("Original Array... ");
        for (int e : arr) {
            System.out.print(" " + e);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {

                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println("\n\nNew Array... ");
        for (int e : arr) {
            System.out.print(" " + e);
        }
    }
}
