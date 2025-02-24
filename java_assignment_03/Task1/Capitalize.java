package java_assignment_03.Task1;

import java.util.Scanner;

public class Capitalize {
    public static String capitalizeAlternate(String input) {
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = (i % 2 == 0) ? Character.toUpperCase(input.charAt(i)) : input.charAt(i);
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String input=sc.nextLine();
        System.out.println("Capitalized Alternate: " + capitalizeAlternate(input));
    }
}
