package Arrays;

//* pass_by_value:- pass_by_value in variable
//* pass_by_reference:- pass_by_reference in array

class ChangeArr {
    void chageMyArr(int[] arr, int size)
    {
        for(int i=0; i<size; i++)
        {
            arr[i] *= 2;
        }
    }
}

class PassRef {
    public static void main(String[] args)
    {
        ChangeArr C = new ChangeArr();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int size = 3;
        
        System.out.println("Array before function call...");
        for(int i=0; i<size; i++)
        {
            System.out.print(" "+arr[i]);
        }

        C.chageMyArr(arr, size);

        System.out.println("\nArray after function call...");
        for(int i=0; i<size; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}