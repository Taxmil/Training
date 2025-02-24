package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveThirdElement {
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
        if (colors.size() > 2) {
            colors.remove(2);
            System.out.println("Updated List after removing the third element: " + colors);
        } else {
            System.out.println("The list doesn't have enough elements to remove the third one.");
        }
    }
}
