import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        int number = takeInput("Enter a number to calculate its factorial: ");
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }
    public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial);
    }
