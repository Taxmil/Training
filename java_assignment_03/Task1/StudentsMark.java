package java_assignment_03.Task1;

import java.util.Scanner;

public class StudentsMark {
    static class Student {
        String name;
        int total;
        double average;

        public Student(String name, int[] marks) {
            this.name = name;
            this.total = 0;
            for (int mark : marks) {
                this.total += mark;
            }

            this.average = (double) total / marks.length;
        }

        @Override
        public String toString() {
            return name + " | Total: " + total + " | Average: " + average;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name: ");
            String name = scanner.next();
            System.out.print("Enter number of subjects: ");
            int[] marks = new int[scanner.nextInt()];

            for (int j = 0; j < marks.length; j++) {
                System.out.print("Marks for subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }

            students[i] = new Student(name, marks);
        }
        scanner.close();
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}