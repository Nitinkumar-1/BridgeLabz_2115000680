import java.util.Scanner;
public class Lexicographical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
   System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                } else {
                    System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                }
                areEqual = false;
                break;
            }
        }
            if (areEqual) {
            if (str1.length() < str2.length()) {
   System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (str1.length() > str2.length()) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal.");
            }
        }
    }
}
