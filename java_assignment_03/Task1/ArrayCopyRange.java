package java_assignment_03.Task1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] original = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            original[i] = scanner.nextInt();
        }
        System.out.print("Enter the start index for copying: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index (exclusive) for copying: ");
        int end = scanner.nextInt();
        if (start < 0 || end > n || start >= end) {
            System.out.println("Invalid range! Please enter valid indices.");
        } else {
            int[] copiedRange = Arrays.copyOfRange(original, start, end);
            System.out.println("Copied Range: " + Arrays.toString(copiedRange));
        }
        scanner.close();
    }
}