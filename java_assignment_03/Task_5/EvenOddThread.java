package java_assignment_03.Task_5;

public class EvenOddThread {
    public static void main(String[] args) {
        Even even = new Even();
        Odd oddThread = new Odd();
        even.start();
        oddThread.start();
    }
}
    class Even extends Thread {
        public void run() {
            for (int i = 1; i <= 20; i ++) {
                if(i%2 ==0)
                    System.out.println("Even: " + i);
            }
        }
    }

     class Odd extends Thread {
        public void run() {
            for (int i = 1; i <= 20; i ++) {
                if(i%2 !=0)
                    System.out.println("Odd: " + i);
            }
        }
    }
