package java_assignment_03.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static <T> List<T> mergeListsAlternately(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int i = 0, j = 0;
        while (i < size1 || j < size2) {
            if (i < size1) mergedList.add(list1.get(i++));
            if (j < size2) mergedList.add(list2.get(j++));
        }
        return mergedList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements for the first list: ");
        int n1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        List<String> list1 = new ArrayList<>();
        System.out.println("Enter " + n1 + " elements for the first list:");
        for (int i = 0; i < n1; i++) {
            list1.add(scanner.nextLine());
        }
        System.out.print("Enter the number of elements for the second list: ");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        List<String> list2 = new ArrayList<>();
        System.out.println("Enter " + n2 + " elements for the second list:");
        for (int i = 0; i < n2; i++) {
            list2.add(scanner.nextLine());
        }

        // Print the original lists
        System.out.println("First List: " + list1);
        System.out.println("Second List: " + list2);
        List<String> mergedList = mergeListsAlternately(list1, list2);
        System.out.println("Merged List: " + mergedList);

        scanner.close();
    }
}
