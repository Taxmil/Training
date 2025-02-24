package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertElementInArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());

        System.out.println("Enter element to insert at first: ");
        colors.add(0, input.nextLine());

        System.out.println("Updated list after inserting element: " + colors);
    }
}
