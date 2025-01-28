import java.util.Random;
import java.util.Scanner;
public class level3Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        double[][] scores = generateScores(numStudents);
        double[][] result = calculateTotalAveragePercentage(scores);
        displayScorecard(result);
    }
    public static double[][] generateScores(int numStudents) {
        Random random = new Random();
        double[][] scores = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 50 + random.nextInt(51);  // Random 2-digit scores between 50 and 100
            }
        }
        return scores;
    }
    public static double[][] calculateTotalAveragePercentage(double[][] scores) {
        double[][] result = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
            result[i][3] = Math.round(percentage * 100.0) / 100.0;  // Round percentage to 2 decimal places
        }

        return result;
    }
    public static void displayScorecard(double[][] result) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10d%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f\n", (i + 1), result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }
}

