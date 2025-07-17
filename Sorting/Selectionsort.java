package Sorting;

import java.util.Scanner;

public class Selectionsort {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. off elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array inputs ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        selectionsort(arr,n);

        System.out.println("sorted array is ");
        printarray(arr);

        sc.close();

    }

    public static void selectionsort(int arr[],int n ){
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                min=j;
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

            System.out.println("after pass"+(i+1)+": ");
            printarray(arr);
        }
    }

    public static void printarray(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }


    
}
