package java_assignment_03.Task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadLine {
    public static void main(String[] args) {
        System.out.println("Enter the file path:");
        Scanner scanner = new Scanner(System.in);
        String filePath =scanner.nextLine();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
