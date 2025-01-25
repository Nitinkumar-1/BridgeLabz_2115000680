import java.util.Scanner;
public class level1Q10 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num > 0) {
            String[] results = new String[num + 1];
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = Integer.toString(i);
                }
            }
            for (int i = 1; i <= num; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}
