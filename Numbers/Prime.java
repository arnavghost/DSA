package Numbers;

import java.util.Scanner;

public class Prime {
    public static boolean Isprime(int n) {
        int c = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                c++;
                if (i != n / i) {
                    c++; // count the pair divisor
                }
            }
        }

        if(c==2)
        return true;
        else
        return false; // prime numbers have exactly 2 divisors: 1 and itself
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(Isprime(n));  // true or false
    }
}
