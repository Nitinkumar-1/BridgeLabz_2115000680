import java.util.Arrays;
public class level3Q5 {
    public static void main(String[] args) {
        int number = 25; 

        boolean isPrime = isPrime(number);
        boolean isNeon = isNeonNumber(number);
        boolean isSpy = isSpyNumber(number);
        boolean isAutomorphic = isAutomorphicNumber(number);
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Number: " + number);
        System.out.println("Is Prime Number: " + isPrime);
        System.out.println("Is Neon Number: " + isNeon);
        System.out.println("Is Spy Number: " + isSpy);
        System.out.println("Is Automorphic Number: " + isAutomorphic);
        System.out.println("Is Buzz Number: " + isBuzz);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = sumOfDigits(square);
        return sumOfDigits == number;
    }
    public static boolean isSpyNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
}
