package java_assignment_03.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static <T> int findFirstOccurrence(List<T> list, T target) {
        return list.indexOf(target); // Returns the index or -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userList = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            userList.add(scanner.nextLine());
        }
        System.out.println("List: " + userList);
        System.out.print("Enter the element to search: ");
        String target = scanner.nextLine();
        int index = findFirstOccurrence(userList, target);
        if (index != -1) {
            System.out.println("First occurrence of '" + target + "' is at index: " + index);
        } else {
            System.out.println("'" + target + "' not found in the list.");
        }

        scanner.close();
    }
}

