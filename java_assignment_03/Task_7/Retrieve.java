package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Retrieve {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Color List: " + colors);
        System.out.print("Enter index to retrieve : ");
        int index = input.nextInt();
        if (index >= 0 && index < colors.size()) {
            System.out.println("Element at index " + index + ": " + colors.get(index));
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1));
        }
        input.close();
    }
}
