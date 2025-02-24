package java_assignment_03.Task_5;

import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the limit:");
        int limit =input.nextInt();  // Find sum of primes up to 50
        int numThreads = 2;  // Use 2 threads
        Prime[] threads = new Prime[numThreads];

        int mid = limit / 2;
        threads[0] = new Prime(1, mid);  // Thread 1: 1 to mid
        threads[1] = new Prime(mid + 1, limit);  // Thread 2: mid+1 to limit

        threads[0].start();
        threads[1].start();

        threads[0].join();
        threads[1].join();

        long totalSum = threads[0].getSum() + threads[1].getSum();

        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}

class Prime extends Thread {
    private int start, end;
    private long sum = 0;

    public Prime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }
}
