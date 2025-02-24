package java_assignment_03.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateElements {

    public static int[] copyAlternateElements(int[] arr) {
        int[] result = new int[(arr.length + 1) / 2];
        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements:S");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Copy Alternate elements : "+Arrays.toString(copyAlternateElements(arr)));
    }
}
