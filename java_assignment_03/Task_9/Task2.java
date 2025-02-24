package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> words = new ArrayList<>();
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowerCaseWords = words.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Original List: " + words);
        System.out.println("Uppercase List: " + upperCaseWords);
        System.out.println("Lowercase List: " + lowerCaseWords);

        scanner.close();
    }
}
