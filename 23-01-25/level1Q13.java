import java.util.Scanner;
                public class level1Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
                   if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sumFormula = n * (n + 1) / 2;
                        int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using for loop: " + sumForLoop);
                        if (sumFormula == sumForLoop) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a discrepancy between the computations.");
            }
        }
                     scanner.close();
    }
}
