package Thread;

class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread1");
            i++;
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread2");
            i++;
        }
    }
}

class ExtendsTh {
    public static void main(String args[]) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        
        T1.start(); 
        T2.start();
    }
}
