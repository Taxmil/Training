package java_assignment_03.Task_3;

import java.io.File;
import java.util.Scanner;

public class FileList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String directoryPath = scanner.nextLine();
        scanner.close();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            String[] fileList = directory.list();
            if (fileList != null && fileList.length > 0) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (String fileName : fileList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
