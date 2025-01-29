import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        int terms = takeInput("Enter the number of terms in the Fibonacci sequence: ");
        printFibonacci(terms);
    }
        public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
        public static void printFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
