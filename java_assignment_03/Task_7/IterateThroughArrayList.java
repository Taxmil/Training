package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class IterateThroughArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Iterate through all elements in the array: ");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
