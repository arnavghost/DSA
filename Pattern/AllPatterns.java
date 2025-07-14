import java.util.Scanner;

public class AllPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AllPatterns obj = new AllPatterns();
        System.out.println("Enter pattern number (1-11): ");
        int choice = sc.nextInt();
        obj.runPattern(choice, sc);
        sc.close();
    }

    private void runPattern(int pattern, Scanner sc) {
        switch (pattern) {
            case 1 -> pattern1();
            case 2 -> pattern2();
            case 3 -> pattern3(sc);
            case 4 -> pattern4(sc);
            case 5 -> pattern5(sc);
            case 6 -> pattern6(sc);
            case 7 -> pattern7(sc);
            case 8 -> pattern8(sc);
            case 9 -> pattern9(sc);
            case 10 -> pattern10(sc);
            case 11 -> pattern11(sc);
            default -> System.out.println("Invalid choice.");
        }
    }

    private void pattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

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

    private void pattern3(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    private void pattern4(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }

    private void pattern5(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i));
        }
    }

    private void pattern6(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    private void pattern7(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    private void pattern8(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(), num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    private void pattern9(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? "1" : "0");
            }
            System.out.println();
        }
    }

    private void pattern10(Scanner sc) {
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

    private void pattern11(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(n));
        }
    }
}
