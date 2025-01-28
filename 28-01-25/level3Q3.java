import java.util.Arrays;
public class level3Q3 {
    public static void main(String[] args) {
        int number = 1729; 
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int sumOfDigits = findSumOfDigits(digits);
        int sumOfSquares = findSumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Sum of Digits: " + sumOfDigits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequency:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit: " + freq[0] + " -> Frequency: " + freq[1]);
            }
        }
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
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
        public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}
