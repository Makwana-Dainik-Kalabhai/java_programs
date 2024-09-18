package Recursion;
class Fibbonacci {

    static void withRec(int n1, int n2, int count) {

        if(count == 0) {
            return;
        }

        if(n1 == 0 && n2 == 1) {
        System.out.printf("%d %d",n1,n2);
        }

        int sum = 0;
        sum = n1 + n2;
        n1 = n2;
        n2 = sum;
        System.out.printf(" %d",sum);
        
        withRec(n1, n2, count-1);
    }

    static void withoutRic(int count) {

        int n1 = 0, n2 = 1;
        System.out.printf("%d %d",n1,n2);
        
        int sum = 0;
        
        while(count != 0) {
            sum = n1+n2;
            n1= n2;
            n2 = sum;
            System.out.printf(" %d",sum);
            count--;
        }

    }
    public static void main(String args[]) {
        int n1=0, n2=1, count=10;

        System.out.println("\nWith Recursion");
        withRec(n1, n2, count);

        System.out.println("\n\nWithout Recursion");
        withoutRic(count);
    }
}
