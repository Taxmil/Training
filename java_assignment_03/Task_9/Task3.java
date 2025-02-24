package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        int evenSum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("List of Numbers: " + numbers);
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
        scanner.close();
    }
}
