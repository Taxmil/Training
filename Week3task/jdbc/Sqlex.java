package jdbc;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;
import java.util.Scanner;

public  class Sqlex {
    static String url = "jdbc:mysql://localhost:3306/company";
    static String username = "root";
    //Give the password to access MySQL server
    static String password = "sivamalar09";

    public static void Selectop() throws SQLException {
        String query = "select * from employee";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("Id is:" + rs.getInt(1));
            System.out.println("Name is:" + rs.getString(2));
            System.out.println("Age is:" + rs.getInt(3));
            System.out.println("Salary is:" + rs.getInt(4));
        }
        connection.close();
    }

    public static void Insertop(int id, String name, int age, int salary) throws SQLException {
        String query = "insert into employee(emp_id, emp_name, age, emp_salary) values (?,?,?,?)";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setInt(3, age);
        pstmt.setInt(4, salary);
        int rowUpdated = pstmt.executeUpdate();
        System.out.println("the values are sucessfully inserted: " + rowUpdated);
        connection.close();
    }

    public static void Updateop(int id, String name, int age, int salary) throws SQLException {
        String query = "update employee set emp_id=?,emp_name=?,age=?,emp_salary=? where emp_id=?";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setInt(3, age);
        pstmt.setInt(4, salary);
        pstmt.setInt(5, id);
        int rowupdated = pstmt.executeUpdate();
        System.out.println("the values has been updated sucessfully:" + rowupdated);
        connection.close();
    }

    public static void Deleteop(int id) throws SQLException {
        String Query = "delete from employee where emp_id=" + id;
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();
        int rowupdated = stmt.executeUpdate(Query);
        System.out.println("the row has been sucessfully deleted:" + rowupdated);
        connection.close();
    }


    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        boolean isRun = true;
        do {
            System.out.println();
            System.out.println("Select which operation you want to perform? \n1.Display\n2.Insert\n3.Update\n4.Delete\n5.Exit\n(eg. If 'Display' Enter 1)");
            int operation = in.nextInt();
            switch (operation) {
                case 1 -> Selectop();
                case 2 -> {
                    System.out.println("Enter the details: ");
                    System.out.println("Enter the Id:");
                    int id = in.nextInt();
                    System.out.print("Name: ");
                    String name = in.next();
                    System.out.print("Age: ");
                    int age = in.nextInt();
                    in.nextLine();
                    System.out.print("Salary: ");
                    int salary = in.nextInt();
                    Insertop(id, name, age, salary);
                    System.out.println("Successfully Inserted.");
                }
                case 3 -> {
                    System.out.print("Enter the employee ID and Details to be updated: ");
                    System.out.print("\nEnter employee ID: ");
                    int emp_id = in.nextInt();
                    System.out.print("Enter employee name: ");
                    String emp_name = in.next();
                    System.out.print("Enter employee salary: ");
                    int emp_salary = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter employee Age: ");
                    int age = in.nextInt();
                    Updateop(emp_id, emp_name, age, emp_salary);
                    System.out.println("Successfully Updated.");
                }
                case 4 -> {
                    System.out.print("Enter employee ID to delete: ");
                    int emp_id = in.nextInt();
                    Deleteop(emp_id);
                    System.out.println("Successfully Deleted.");
                }
                case 5 -> isRun = false;
            }
        } while (isRun);
    }
}

