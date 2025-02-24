package java_assignment_03.Task_7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsertAtSpecificPosition {
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
        if (position < 0 || position > colors.size()) {
            System.out.println("Invalid position! Exiting...");
            input.close();
            return;
        }
        List<String> newColors = List.of("Yellow", "Purple");
        int index = position;
        for (String color : newColors) {
            colors.add(index++, color);
        }
        System.out.println("Updated LinkedList: " + colors);
        input.close();
    }
}
