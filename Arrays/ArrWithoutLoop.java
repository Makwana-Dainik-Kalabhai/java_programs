package Arrays;
class ArrWithoutLoop {

    public static void recursion(int n, int[] arr) {

        if (n != 0) {
            recursion(n - 1, arr);
            arr[n - 1] = n;
            System.out.print(" "+arr[n-1]);
        }

    }
    public static void main(String args[]) {
        int x=5;

        int[] arr = new int[x];

        recursion(x, arr);
    }    
}
