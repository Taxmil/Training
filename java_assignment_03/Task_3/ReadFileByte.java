package java_assignment_03.Task_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        try {
            File file = new File(filePath);
            if (!file.exists() || !file.isFile()) {
                System.out.println("File not found! Please check the file path.");
                return;
            }
            // Read file data into a byte array
            byte[] fileData = readFileToByteArray(file);
            System.out.println("File successfully read into byte array!");
            System.out.println("Total bytes read: " + fileData.length);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        return data;
    }
}

