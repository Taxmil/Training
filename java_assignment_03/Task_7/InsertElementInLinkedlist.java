package java_assignment_03.Task_7;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertElementInLinkedlist {
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
        System.out.print("Enter the position: ");
        int position = input.nextInt();
        input.nextLine();
        System.out.print("Enter the element to insert: ");
        String newElement = input.nextLine();
        input.close();
        if (position < 0 || position > colors.size()) {
            System.out.println("Invalid position! Exiting...");
            return;
        }
        colors.add(position, newElement);
        System.out.println("Updated List: "+colors);
    }
}
