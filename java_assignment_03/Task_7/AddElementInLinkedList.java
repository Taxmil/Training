package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AddElementInLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> colors = new LinkedList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine().toLowerCase());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Original List: " + colors);
        System.out.println("enter element add at end of linkedlist: ");
        colors.add(input.nextLine());
        System.out.println("Updated LinkedList: " + colors);
    }
}
