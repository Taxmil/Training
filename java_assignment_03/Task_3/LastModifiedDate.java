package java_assignment_03.Task_3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LastModifiedDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long lastModified = file.lastModified(); // Get last modified time in milliseconds
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(lastModified);
            System.out.println("Last Modified Date: " + formattedDate);
        } else {
            System.out.println("The file does not exist or is not a valid file.");
        }
        scanner.close();
    }
}
