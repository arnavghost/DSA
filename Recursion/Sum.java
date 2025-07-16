package Recursion;
import java.util.Scanner;

public class Sum {

    // Recursive function to return sum from 1 to n
    public static int addition(int n) {
        if (n == 0) 
        return 0;
        else  // base case
        return n + addition(n - 1); // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int sum = addition(n);
        System.out.println("Sum from 1 to " + n + " is: " + sum);
    }
}
