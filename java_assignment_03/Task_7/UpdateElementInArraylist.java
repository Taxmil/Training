package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElementInArraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Original List: " + colors);
        System.out.print("Enter index to update: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < colors.size()) {
            System.out.print("Enter new color: ");
            String newColor = input.nextLine();
            colors.set(index, newColor);
            System.out.println("Updated List: " + colors);
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1));
        }

        input.close();
    }
}
