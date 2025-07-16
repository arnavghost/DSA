package Numbers;

// import java.util.Scanner;

// public class Gcd {
//     public static int findGCD(int a, int b) {
//         int gcd = 1;

//         int max = Math.min(a, b);  

//         for (int i = 1; i <= max; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;  // Update GCD if i divides both
//             }
//         }

//         return gcd;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         sc.close();

//         int gcd = findGCD(num1, num2);
//         System.out.println("GCD: " + gcd);
//     }
// }



import java.util.Scanner;

public class Gcd{
    // Recursive function to find GCD
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("GCD: " + findGCD(a, b));
    }
}
