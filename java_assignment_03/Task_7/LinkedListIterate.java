package java_assignment_03.Task_7;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListIterate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> colors = new LinkedList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine().toLowerCase());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.print("Enter starting position (0 to " + (colors.size() - 1) + "): ");
        int startIndex = input.nextInt();
        if (startIndex < 0 || startIndex >= colors.size()) {
            System.out.println("Invalid index! Exiting...");
            return;
        }
        System.out.println("\nIterating using for loop from index " + startIndex + ":");
        for (int i = startIndex; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
