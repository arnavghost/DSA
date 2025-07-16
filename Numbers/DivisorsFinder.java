package Numbers;

import java.util.Scanner;
class Divisor {
    public static void divisors(int n) {
        System.out.println("divisors:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }

    }


    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                sc.close();
                divisors(number);
    }
}


// class Divisor {
//     public static void divisors(int n){
//         for (int i =1;i<=(int)Math.sqrt(n);i++)
//         {
//             if(n%i==0){
//                 System.out.println(i+" ");
//             }
//         }

//         for(int i= (int)Math.sqrt(n);i>=1;i--)
//         {
//             if(n%i==0 && i!=(n/i))
//             System.out.println(i+" ");
//         }
//     }
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         sc.close();
//         divisors(number);
//     }

// }with less time complexity 



// import java.util.*;

// public class DivisorsFinder {
//     public static List<Integer> findDivisors(int n) {
//         List<Integer> divisors = new ArrayList<>();

//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 divisors.add(i);
//             }
//         }

//         return divisors;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         sc.close();

//         List<Integer> result = findDivisors(number);
//         System.out.println("Divisors: " + result);
//     }
// }
