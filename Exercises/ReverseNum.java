
class ReverseNum {

    public static void main(String[] args) {
        int num = 12345;
        int n = num;
        int newNum = 0;

        while (n > 0) {
            int r = n % 10;
            newNum = (newNum*10)+r;
            n/=10;
        }
        System.out.println("Original = "+num);
        System.out.println("Reverse = "+newNum);
    }
}
