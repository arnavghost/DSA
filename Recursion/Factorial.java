package Recursion;
import java.util.Scanner;

public class Factorial{

    // Recursive function to return sum from 1 to n
    public static int fact(int n) {
        if (n == 0) 
        return 1;
        else  // base case
        return n * fact(n - 1); // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(fact(n));
    }
}

