package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Find max value using Streams
        int max = numbers.stream()
                .max(Integer::compare)
                .orElseThrow();
        int min = numbers.stream()
                .min(Integer::compare)
                .orElseThrow();
        System.out.println("Original List: " + numbers);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        scanner.close();
    }
}
