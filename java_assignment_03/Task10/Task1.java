package java_assignment_03.Task10;

import java.sql.*;
import java.util.Scanner;

public class Task1{
    static String url = "jdbc:mysql://localhost:3306/student";
    static String username = "root";
    static String password = "hsengivneevak22@";

    static Connection connect = null;
    static PreparedStatement prepstatement = null;
    static ResultSet result = null;

    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Insert a new Student");
            System.out.println("2. Update a Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Display all Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    insertMultipleStudents();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    selectStudents();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // Task 1: Recursively insert multiple student records
    public static void insertMultipleStudents() throws SQLException {
        Scanner in = new Scanner(System.in);
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("INSERT INTO student (student_name, student_age, student_class, student_yearofbirth) VALUES (?, ?, ?, ?)");

        while (true) {
            System.out.println("Enter student details (or type 'exit' to stop):");
            System.out.print("Enter name: ");
            String name = in.nextLine();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter age: ");
            int age = in.nextInt();
            in.nextLine();  // Consume newline

            System.out.print("Enter class: ");
            String studentClass = in.nextLine();

            System.out.print("Enter year of birth: ");
            int yearOfBirth = in.nextInt();
            in.nextLine();  // Consume newline

            prepstatement.setString(1, name);
            prepstatement.setInt(2, age);
            prepstatement.setString(3, studentClass);
            prepstatement.setInt(4, yearOfBirth);

            prepstatement.executeUpdate();
            System.out.println("Student record inserted successfully!\n");
        }
        connect.close();
    }

    // Task 2: Dynamically update a student record using Scanner class
    public static void updateStudent() throws SQLException {
        Scanner in = new Scanner(System.in);
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("UPDATE student SET student_name=?, student_age=?, student_class=?, student_yearofbirth=? WHERE student_id=?");

        System.out.print("Enter Student ID to update: ");
        int id = in.nextInt();
        in.nextLine();  // Consume newline

        System.out.print("Enter new name: ");
        String name = in.nextLine();

        System.out.print("Enter new age: ");
        int age = in.nextInt();
        in.nextLine();  // Consume newline

        System.out.print("Enter new class: ");
        String studentClass = in.nextLine();

        System.out.print("Enter new year of birth: ");
        int yearOfBirth = in.nextInt();

        prepstatement.setString(1, name);
        prepstatement.setInt(2, age);
        prepstatement.setString(3, studentClass);
        prepstatement.setInt(4, yearOfBirth);
        prepstatement.setInt(5, id);

        int rowsUpdated = prepstatement.executeUpdate();
        System.out.println(rowsUpdated > 0 ? "Student record updated successfully!" : "Student ID not found.");
        connect.close();
    }

    // Task 3: Delete a student record using Scanner class
    public static void deleteStudent() throws SQLException {
        Scanner in = new Scanner(System.in);
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("DELETE FROM student WHERE student_id=?");

        System.out.print("Enter Student ID to delete: ");
        int id = in.nextInt();

        prepstatement.setInt(1, id);
        int rowsDeleted = prepstatement.executeUpdate();
        System.out.println(rowsDeleted > 0 ? "Student record deleted successfully!" : "Student ID not found.");
        connect.close();
    }

    // Task 4: Select and display all student records
    public static void selectStudents() throws SQLException {
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("SELECT * FROM student");
        result = prepstatement.executeQuery();

        while (result.next()) {
            System.out.println("\nStudent ID: " + result.getInt("student_id"));
            System.out.println("Student Name: " + result.getString("student_name"));
            System.out.println("Student Age: " + result.getInt("student_age"));
            System.out.println("Student Class: " + result.getString("student_class"));
            System.out.println("Student Year of Birth: " + result.getInt("student_yearofbirth"));
        }
        connect.close();
    }
}
