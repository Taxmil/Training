package java_assignment_03.Task8;

import java.sql.*;
import java.util.Scanner;

public class JdbcExample {
    static String url = "jdbc:mysql://localhost:3306/jdbcexample";
    static String username = "root";
    static String password = "hsengivneevak22@";

    static Connection connect = null;
    static PreparedStatement prepstatement = null;
    static ResultSet result = null;

    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Insert a new Row");
            System.out.println("2. Update a Row");
            System.out.println("3. Delete a Row");
            System.out.println("4. Select all rows");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    insertMultipleRows();
                    break;
                case 2:
                    updateRecord();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    selectRecords();
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

    public static void insertMultipleRows() throws SQLException {
        Scanner in = new Scanner(System.in);
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("INSERT INTO employee (name, age, domain, salary) VALUES (?, ?, ?, ?)");

        while (true) {
            System.out.println("Enter employee details (or type 'exit' to stop):");
            System.out.print("Enter name: ");
            String name = in.nextLine();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter age: ");
            int age = in.nextInt();
            in.nextLine();
            System.out.print("Enter department: ");
            String department = in.nextLine();

            System.out.print("Enter salary: ");
            int salary = in.nextInt();
            in.nextLine();

            prepstatement.setString(1, name);
            prepstatement.setInt(2, age);
            prepstatement.setString(3, department);
            prepstatement.setInt(4, salary);

            prepstatement.executeUpdate();
            System.out.println("Record inserted successfully!\n");
        }
        connect.close();
    }

    public static void updateRecord() throws SQLException {
        Scanner in = new Scanner(System.in);
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("UPDATE employee SET name=?, age=?, domain=?, salary=? WHERE id=?");

        System.out.print("Enter Employee ID to update: ");
        int id = in.nextInt();
        in.nextLine();

        System.out.print("Enter new name: ");
        String name = in.nextLine();

        System.out.print("Enter new age: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Enter new domain: ");
        String domain = in.nextLine();

        System.out.print("Enter new salary: ");
        int salary = in.nextInt();

        prepstatement.setString(1, name);
        prepstatement.setInt(2, age);
        prepstatement.setString(3, domain);
        prepstatement.setInt(4, salary);
        prepstatement.setInt(5, id);

        int rowsUpdated = prepstatement.executeUpdate();
        System.out.println(rowsUpdated > 0 ? "Record updated successfully!" : "ID not found.");
        connect.close();
    }

    public static void deleteRecord() throws SQLException {
        Scanner in = new Scanner(System.in);
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("DELETE FROM employee WHERE id=?");

        System.out.print("Enter Employee ID to delete: ");
        int id = in.nextInt();

        prepstatement.setInt(1, id);
        int rowsDeleted = prepstatement.executeUpdate();
        System.out.println(rowsDeleted > 0 ? "Record deleted successfully!" : "ID not found.");
        connect.close();
    }

    public static void selectRecords() throws SQLException {
        connect = DriverManager.getConnection(url, username, password);
        prepstatement = connect.prepareStatement("SELECT * FROM employee");
        result = prepstatement.executeQuery();
        while (result.next()) {
            System.out.println("\nEmployee ID: " + result.getInt("id"));
            System.out.println("Employee Name: " + result.getString("name"));
            System.out.println("Employee Age: " + result.getInt("age"));
            System.out.println("Employee Department: " + result.getString("domain"));
            System.out.println("Employee Salary: " + result.getInt("salary"));
        }
        connect.close();
    }
}
