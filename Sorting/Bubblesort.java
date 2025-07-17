package Sorting;

import java.util.Scanner;

public class Bubblesort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        printarray(arr);

        bubblesort(arr, n);

        System.out.println("Sorted array is:");
        printarray(arr);

        sc.close();
    }

    public static void bubblesort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            for (int j = 0; j < n - i - 1; j++) { // compare till n-i-1
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("After pass " + (i + 1) + ":");
            printarray(arr);
        }
    }

    public static void printarray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
