package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArraylist {
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
        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);
    }
}
