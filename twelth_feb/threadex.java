package twelve;

public class threadex extends Thread {
    public static void main(String[] args) {//Thread 1
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        System.out.println("From Main thread!");
        Thread1 t1 = new Thread1();
        t1.start();//calls run method-Thread 2
        t1.run();
        Thread2 t2 = new Thread2();
        Thread tt2 = new Thread(t2);
        new Thread(t2).start();//Thread 3
        tt2.start();//Thread 4
        t2.run();

    }

    static class Thread1 extends Thread {
        public void run() {
            System.out.println("From Thread1!" + this.getName());
            // System.out.println(10/0);
        }
    }
    static class Thread2 implements Runnable {
            public void run() {
                System.out.println("From Thread2!");
            }
        }
    }
