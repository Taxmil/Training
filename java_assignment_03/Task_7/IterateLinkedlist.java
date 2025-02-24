package java_assignment_03.Task_7;

import java.util.LinkedList;
import java.util.Scanner;

public class IterateLinkedlist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> colors = new LinkedList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine().toLowerCase());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Iterate through linkedlist: ");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
