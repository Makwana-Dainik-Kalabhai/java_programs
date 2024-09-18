package Thread;

class ThreadM1 extends Thread {
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("Thread Method1");
            i++;
        }
    }
}

class ThreadM2 extends Thread {
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("Thread Method2");
            i++;
            
            try {
                Thread.sleep(3000);
            }
            catch(Exception e) {
                System.out.println("Error = "+e);
            }
        }
    }
}

class ThreadMethod {
    public static void main(String args[]) {
        ThreadM1 M1 = new ThreadM1();
        ThreadM2 M2 = new ThreadM2();

        M1.start();
        //! Used to set priority of the process.
        M2.setPriority(10);
        M2.start();

        //! Used to complete first process then run next process.
        //! For synchronization
        try {
            M2.join();
        }
        catch(Exception e) {
            System.out.println("Error = "+e);
        }
    }
}
