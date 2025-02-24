package java_assignment_03.Task_4;

import java.util.Scanner;

public class OddException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            checkEven(number);
            System.out.println("The number is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkEven(int num) {
        if (num % 2 != 0) {
            throw new IllegalArgumentException("It is Odd number.");
        }
    }
}
