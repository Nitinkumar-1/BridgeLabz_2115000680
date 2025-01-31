import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        int[] frequency = new int[256]; // assuming ASCII characters
        char mostFrequentChar = ' ';
        int maxFrequency = 0;
        for (char c : input.toCharArray()) {
            frequency[c]++;
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequentChar = c;
            }
        }
        System.out.println("Most frequent character: " + mostFrequentChar);
    }
}
