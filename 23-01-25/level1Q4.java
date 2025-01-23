import java.util.Scanner;

public class level1Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number >= 0) {

                int sumOfNumbers = number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sumOfNumbers);
            } else {
                System.out.println("The number " + number + " is not a natural number");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

        scanner.close();
    }
}
