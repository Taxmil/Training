package java_assignment_03.Task_5;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Array that needs to be sorted: "+Arrays.toString(arr));

        int mid = arr.length / 2;

        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, arr.length);

        SortThread leftArrySorter = new SortThread(leftArray);
        SortThread rightArraySorter = new SortThread(rightArray);

        leftArrySorter.start();
        rightArraySorter.start();

        leftArrySorter.join();
        rightArraySorter.join();

        merge(arr, leftArray, rightArray);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            arr[k++] = (leftArray[i] <= rightArray[j]) ? leftArray[i++] : rightArray[j++];
        }

        while (i < leftArray.length) arr[k++] = leftArray[i++];
        while (j < rightArray.length) arr[k++] = rightArray[j++];
    }
}


class SortThread extends Thread {
    private int[] arr;

    public SortThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        Arrays.sort(arr);
    }
}
