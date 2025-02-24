package java_assignment_03.Task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
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
        System.out.print("Enter the letter to count words that start with it: ");
        char letter = scanner.next().charAt(0);
        long count = words.stream().filter(word -> word.startsWith(String.valueOf(letter))).count();
        System.out.println("Original List: " + words);
        System.out.println("Number of words starting with '" + letter + "': " + count);
        scanner.close();
    }
}
