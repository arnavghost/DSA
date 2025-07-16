package Recursion;

import java.util.Scanner;

public class Print1ToN {

    public static void printNumbers(int n) {
        if (n == 0) return;        // base case

        printNumbers(n - 1);       // recursive call first
        System.out.println(n);     // print in increasing order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        printNumbers(n);
    }
}
