package Arrays;
class PassArr {

    static void change(int num, int[] arr) {
        num = 40;
        arr[0] = 50;
    }
    public static void main(String args[]) {
        int num = 10;
        int[] arr = {10, 20, 30, 40, 50}; // arr is reference(address) of object {10, 20, 30, 40, 50}

        change(num, arr); //Changes the arr[0], but not chaging the value of num variable
        System.out.printf("num: %d,  arr[0]: %d",num ,arr[0]);
    }
}