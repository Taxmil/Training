package java_assignment_03.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Task3 {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
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
        System.out.println("Original List: " + userList);
        List<String> reversedList = reverseList(userList);
        System.out.println("Reversed List: " + reversedList);

        scanner.close();
    }
}
