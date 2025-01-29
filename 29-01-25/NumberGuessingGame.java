import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100 and I'll try to guess it!");
        int lowerBound = 1;
        int upperBound = 100;
        boolean correct = false;
        while (!correct) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is the number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = scanner.nextLine().toLowerCase();
        correct = processFeedback(feedback, guess, lowerBound, upperBound);
        }
        System.out.println("Yay! I guessed your number!");
    }
        public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
        public static boolean processFeedback(String feedback, int guess, int lowerBound, int upperBound) {
        if (feedback.equals("correct")) {
            return true;
        } else if (feedback.equals("high")) {
            upperBound = guess - 1;
        } else if (feedback.equals("low")) {
            lowerBound = guess + 1;
        } else {
            System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
        }
        return false;
    }
}
