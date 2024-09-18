package Thread;

class ThreadRun implements Runnable {
    public void run() {
        System.out.println("Run()");
    }
}

class Thread1Cons extends Thread {
    Thread1Cons(Runnable r, String name) {
        super(r,name);
        Thread T = new Thread(r);
        T.start();
    }
}

class ThConstructor {
    public static void main(String args[]) {
        ThreadRun R1 = new ThreadRun();
        Thread1Cons T1 = new Thread1Cons(R1, "Dainik");
        System.out.println("Name: "+T1.getName());
    }
}