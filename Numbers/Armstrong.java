package Numbers;
import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int t = n;

        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, count); 
            temp = temp / 10;
        }

        if (t == sum)
            System.out.println("Armstrong number");
        else 
            System.out.println("Not an Armstrong number");

        sc.close();
    }
}



// import java.util.Scanner;

// public class ArmstrongNumber {
//     public static boolean isArmstrong(int n) {
//         int original = n;
//         int digits = 0;
//         int temp = n;

//         // Count the number of digits
//         while (temp > 0) {
//             digits++;
//             temp /= 10;
//         }

//         // Calculate sum of digits raised to the power of number of digits
//         int sum = 0;
//         temp = n;
//         while (temp > 0) {
//             int digit = temp % 10;
//             int power = 1;
//             for (int i = 0; i < digits; i++) {
//                 power *= digit;
//             }
//             sum += power;
//             temp /= 10;
//         }

//         return sum == original;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         sc.close();

//         // Print only the boolean result
//         System.out.println(isArmstrong(number));
//     }
// }



