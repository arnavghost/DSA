package Recursion;

import java.util.Scanner;

public class PrintNTo1 {

    public static void printDescending(int n) {
        if (n == 0) return;        // base case

        System.out.println(n);     // print before the recursive call
        printDescending(n - 1);    // recursive call with n-1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        printDescending(n);
    }
}

