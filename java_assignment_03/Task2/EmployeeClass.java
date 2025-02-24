package java_assignment_03.Task2;

import java.util.Scanner;

public class EmployeeClass {
    private int empId;
    private String empName;
    private double sal;
    private int yearsOfService;

    // Constructor
    public EmployeeClass(int empId, String empName, double sal, int yearsOfService) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsOfService = yearsOfService;
    }
    public void setEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter EmployeeClass ID: ");
        empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter EmployeeClass Name: ");
        empName = scanner.nextLine();
        System.out.print("Enter Salary: ");
        sal = scanner.nextDouble();
        System.out.print("Enter Years of Service: ");
        yearsOfService = scanner.nextInt();
    }

    public void getEmployeeDetails() {
        System.out.println("\nEmployeeClass Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + sal);
        System.out.println("Years of Service: " + yearsOfService);
    }
    public void getLoanEligibility() {
        if (yearsOfService <= 5) {
            System.out.println(empName + " is not eligible for a loan.");
            return;
        }

        double annualSalary = sal * 12;
        double loanAmount = 0;

        if (annualSalary >= 15_00_000) {
            loanAmount = 7_00_000;
        } else if (annualSalary >= 10_00_000) {
            loanAmount = 5_00_000;
        } else if (annualSalary >= 6_00_000) {
            loanAmount = 2_00_000;
        }

        if (loanAmount > 0) {
            System.out.println(empName + " is eligible for a loan of ₹" + loanAmount);
        } else {
            System.out.println(empName + " is not eligible for a loan.");
        }
    }

    public static void main(String[] args) {
        EmployeeClass emp = new EmployeeClass(0, "", 0, 0);
        emp.setEmployeeDetails();
        emp.getEmployeeDetails();
        emp.getLoanEligibility();
    }
}
