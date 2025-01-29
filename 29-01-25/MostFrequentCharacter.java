import java.util.HashMap;
import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        char mostFrequentChar = ' ';
        int maxFrequency = 0;
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            if (frequencyMap.get(c) > maxFrequency) {
                maxFrequency = frequencyMap.get(c);
                mostFrequentChar = c;
            }
        }
        System.out.println("Most frequent character: " + mostFrequentChar);
    }
}
