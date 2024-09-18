package Arrays;

public class Array {
    public static void main(String args[]) {

        //1) Only declaration
        // int[] arr;

        //2) Declaration and Memory Allocation
        // int[] arr = new int[5]

        //3) Declaration, Memory allocation and Initialization
        // int[] arr = {1, 2, 3, 4, 5}

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Print Array elements using foreach loop");
        for(int ele: arr) {
            System.out.print(" "+ele);
        }
        
        //Multidimensional array
        int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        System.out.println("\n2 Dimensional Array elements using for loop");
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++)
            {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println("");
        }
    }
}
