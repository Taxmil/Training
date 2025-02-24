package java_assignment_03.Task_7;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseIterate {
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
        System.out.println("\nIterating in reverse using for loop:");
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }
}