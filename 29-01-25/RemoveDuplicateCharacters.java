import java.util.Scanner;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean[] seen = new boolean[256];
        char[] chars = input.toCharArray();
        int writeIndex = 0;
        for (char c : chars) {
            if (!seen[c]) {
                chars[writeIndex++] = c;
                seen[c] = true;
            }
        }
        String result = new String(chars, 0, writeIndex);
        System.out.println("Modified string: " + result);
    }
}
