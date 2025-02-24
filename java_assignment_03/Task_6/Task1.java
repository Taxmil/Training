package java_assignment_03.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
        public static <T extends Number> void sumEvenOdd(List<T> numbers) {
            int evenSum = 0, oddSum = 0;
            for (T num : numbers) {
                int value = num.intValue();
                if (value % 2 == 0) {
                    evenSum += value;
                } else {
                    oddSum += value;
                }
            }
            System.out.println("Sum of Even Numbers: " + evenSum);
            System.out.println("Sum of Odd Numbers: " + oddSum);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numberList = new ArrayList<>();
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numberList.add(scanner.nextInt());
            }
            System.out.println("Numbers: " + numberList);
            sumEvenOdd(numberList);
            scanner.close();
        }
}
