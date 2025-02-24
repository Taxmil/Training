package java_assignment_03.Task_5;

public class ThreadExample extends Thread{
        public void run() {
            System.out.println("Hello, Java!");
        }
        public static void main(String[] args) {
            ThreadExample thread = new ThreadExample();
            thread.start();
        }
    }

