import java.util.Arrays;
public class level3Q2 {
     public static void main(String[] args) {
        int number = 153; 
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number, digits);
        int[] largestValues = findLargestAndSecondLargest(digits);
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Number: " + number);
        System.out.println("Count of Digits: " + digitCount);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest Digit: " + largestValues[0] + ", Second Largest: " + largestValues[1]);
        System.out.println("Smallest Digit: " + smallestValues[0] + ", Second Smallest: " + smallestValues[1]);
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
        public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
       public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
        public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
         for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
        public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
