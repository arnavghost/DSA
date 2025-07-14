import java.util.Scanner;

public class AllPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AllPatterns obj = new AllPatterns();
        System.out.println("Enter pattern number (1-11): ");
        int choice = sc.nextInt();
        obj.runPattern(choice);
        sc.close();
    }

    private void runPattern(int pattern) {
        switch (pattern) {
            case 1 -> pattern1();
            case 2 -> pattern2();
            case 3 -> pattern3();
            case 4 -> pattern4();
            case 5 -> pattern5();
            case 6 -> pattern6();
            case 7 -> pattern7();
            case 8 -> pattern8();
            case 9 -> pattern9();
            case 10 -> pattern10();
            case 11 -> pattern11();
            default -> System.out.println("Invalid choice.");
        }
    }

    // Pattern 1: Solid Rectangle
    private void pattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 2: Hollow Rectangle
    private void pattern2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Pattern 3: Right Angled Triangle
    private void pattern3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    // Pattern 4: Inverted Right Triangle
    private void pattern4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }

    // Pattern 5: Right-Aligned Triangle
    private void pattern5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i));
        }
    }

    // Pattern 6: Number Triangle
    private void pattern6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    // Pattern 7: Inverted Number Triangle
    private void pattern7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // Pattern 8: Floyd’s Triangle
    private void pattern8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(), num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    // Pattern 9: 0-1 Triangle
    private void pattern9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
    }

    // Pattern 10: Butterfly Pattern
    private void pattern10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2 * (n - i)));
            System.out.println("*".repeat(i));
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2 * (n - i)));
            System.out.println("*".repeat(i));
        }
    }

    // Pattern 11: Right-Aligned Trapezium
    private void pattern11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(n));
        }
        
    }
    
}
