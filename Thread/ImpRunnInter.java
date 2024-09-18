package Thread;

class ImThread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("ImThread1");
            i++;
        }
    }
}

class ImThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("ImThread2");
            i++;
        }
    }
}

class ImpRunnInter {
    public static void main(String args[]) {
        ImThread1 I1 = new ImThread1();
        Thread T1 = new Thread(I1);

        ImThread2 I2 = new ImThread2();
        Thread T2 = new Thread(I2);

        T1.start();
        T2.start();
    }
}
