package java_assignment_03.Task_3;

import java.io.File;
import java.util.Scanner;

public class FileExtension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        System.out.print("Enter file extension (without .): ");
        String extension = scanner.nextLine().toLowerCase();
        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path!");
            return;
        }
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in the directory.");
            return;
        }
        System.out.println("\nFiles with ." + extension + " extension:");
        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith("." + extension)) {
                System.out.println(file.getName());
            }
        }
        scanner.close();
    }
}
