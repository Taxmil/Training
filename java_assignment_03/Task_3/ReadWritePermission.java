package java_assignment_03.Task_3;

import java.io.File;
import java.util.Scanner;

public class ReadWritePermission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file or directory path: ");
        String path = scanner.nextLine();

        File file = new File(path);
        if (file.exists()) {
            // Check read and write permissions
            System.out.println("The path exists: " + path);
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("The path does NOT exist: " + path);
        }
        scanner.close();
    }
}
