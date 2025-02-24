package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        double average = numbers.stream()
                .mapToInt(num -> num)
                .average()
                .orElse(0);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
