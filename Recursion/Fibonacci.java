package Recursion;
import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;        // base case
        if (n == 1) return 1;        // base case

        int first = fibonacci(n - 1);  // recursive call for n-1
        int second = fibonacci(n - 2); // recursive call for n-2

        int result = first + second;   // combine results
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = sc.nextInt();
        sc.close();

        int fib = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + fib);
    }
}
