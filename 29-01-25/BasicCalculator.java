import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = scanner.nextInt();
        double num1 = takeInput("Enter the first number: ");
        double num2 = takeInput("Enter the second number: ");
        double result = 0;
        boolean validOperation = true;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = divide(num1, num2);
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
                validOperation = false;
        }
        if (validOperation) {
            displayResult(num1, num2, choice, result);
        }
    }
    public static double takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static void displayResult(double num1, double num2, int operation, double result) {
        String operationSymbol = switch (operation) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            default -> "?";
        };
    System.out.printf("%.2f %s %.2f = %.2f%n", num1, operationSymbol, num2, result);
    }
}

