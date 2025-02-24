package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Original List: " + numbers);
        System.out.println("List After Removing Duplicates: " + uniqueNumbers);

        scanner.close();
    }
}
