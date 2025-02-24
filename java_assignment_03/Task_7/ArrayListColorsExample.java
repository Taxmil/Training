package java_assignment_03.Task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListColorsExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("enter colors to add in arraylist:");
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        colors.add(input.nextLine());
        System.out.println("Colors in the list: " + colors);
    }
}
