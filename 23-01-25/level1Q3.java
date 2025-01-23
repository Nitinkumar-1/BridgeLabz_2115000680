import java.util.Scanner;

public class level1Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2 ? "Yes" : "No"));

        scanner.close();
    }
}
