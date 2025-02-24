package java_assignment_03.Task_3;

import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;
            System.out.println("File Size:");
            System.out.println("Bytes: " + fileSizeInBytes + " B");
            System.out.println("Kilobytes: " + String.format("%.2f", fileSizeInKB) + " KB");
            System.out.println("Megabytes: " + String.format("%.2f", fileSizeInMB) + " MB");
        } else {
            System.out.println("File not found! Please check the file path.");
        }
        scanner.close();
    }
}
