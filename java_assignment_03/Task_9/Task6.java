package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> words = new ArrayList<>();
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }
        List<String> ascendingOrder = words.stream().sorted().collect(Collectors.toList());
        List<String> descendingOrder = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Original List: " + words);
        System.out.println("Ascending Order: " + ascendingOrder);
        System.out.println("Descending Order: " + descendingOrder);

        scanner.close();
    }
}
