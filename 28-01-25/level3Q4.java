import java.util.Arrays;
public class level3Q4 {
    public static void main(String[] args) {
        int number = 1221; 
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        boolean isPalindrome = isPalindrome(digits, reversedDigits);
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
    public static boolean isPalindrome(int[] digits, int[] reversedDigits) {
        return areArraysEqual(digits, reversedDigits);
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
