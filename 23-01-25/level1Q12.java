import java.util.Scanner;
             public class level1Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
                     if (n <= 0) {
                      System.out.println("Please enter a positive integer greater than 0.");
        } else {
                        int sumFormula = n * (n + 1) / 2;
            int sumWhileLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhileLoop += counter;
                counter++;
            }
            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using while loop: " + sumWhileLoop);
                        if (sumFormula == sumWhileLoop) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a discrepancy between the computations.");
            }
        }
                      scanner.close();
    }
}
