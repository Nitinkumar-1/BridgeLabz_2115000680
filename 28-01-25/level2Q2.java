import java.util.Scanner;
public class level2Q2 {
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a natural number greater than zero.");
            scanner.close();
            return;
        }
        int sumRec = sumRecursive(num);
        int sumForm = sumFormula(num);
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        if (sumRec == sumForm) {
            System.out.println("Both results match. Computation is correct.");
        } else {
            System.out.println("Results do not match. Check the logic.");
        }
        scanner.close();
    }
}
