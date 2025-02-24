package java_assignment_03.Task_7;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> colors = new LinkedList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine().toLowerCase());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("original list: " + colors);
        System.out.print("Enter the element to find: ");
        String searchElement = input.nextLine();
        input.close();
        int firstIndex = colors.indexOf(searchElement);
        int lastIndex = colors.lastIndexOf(searchElement);

        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchElement + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchElement + "' is at index: " + lastIndex);
        } else {
            System.out.println("Element '" + searchElement + "' not found in the list.");
        }
    }
}
