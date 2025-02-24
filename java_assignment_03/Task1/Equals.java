package java_assignment_03.Task1;
import java.util.Arrays;
import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the arrays: ");
        int n = scanner.nextInt();

        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];

        System.out.println("Enter elements for first array:");
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }

        System.out.println("Enter elements for second array:");
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
            }

        System.out.println("Arrays.equals: " + Arrays.equals(arr1, arr2));
        System.out.println("Arrays.deepEquals: " + Arrays.deepEquals(arr1, arr2));

        scanner.close();
    }

}