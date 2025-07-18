package Sorting;

import java.util.Scanner;

public class Insertionsort {
    

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

        insertionsort(arr, n);

        System.out.println("Sorted array is:");
        printarray(arr);

        sc.close();
    }

    public static void insertionsort(int arr[], int n) {
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j=i-1;

            while( j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=current;

            System.out.println("After pass " + (i ) + ":");
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


