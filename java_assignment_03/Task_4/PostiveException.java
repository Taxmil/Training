package java_assignment_03.Task_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PostiveException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            readNumbersFromFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }

    public static void readNumbersFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNext()) {
            if (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                if (number > 0) {
                    fileScanner.close();
                    throw new IllegalArgumentException("Positive number found: " + number);
                }
            } else {
                fileScanner.next();
            }
        }

        fileScanner.close();
        System.out.println("All numbers are non-positive.");
    }
}
