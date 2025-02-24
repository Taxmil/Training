package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine().toLowerCase());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Original List: " + colors);
        System.out.print("Enter a color to search: ");
        String searchColor = input.nextLine();
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is present in the list.");
        } else {
            System.out.println(searchColor + " is NOT present in the list.");
        }
        input.close();
    }
}