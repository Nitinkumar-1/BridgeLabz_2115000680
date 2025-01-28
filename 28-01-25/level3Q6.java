import java.util.Arrays;
public class level3Q6 {
    public static void main(String[] args) {
        int number = 28; 
        int[] factors = findFactors(number);
        int greatestFactor = findGreatestFactor(factors);
        int sumOfFactors = findSumOfFactors(factors);
        int productOfFactors = findProductOfFactors(factors);
        double productOfCubes = findProductOfCubes(factors);
        boolean isPerfect = isPerfectNumber(number, sumOfFactors);
        boolean isAbundant = isAbundantNumber(number, sumOfFactors);
        boolean isDeficient = isDeficientNumber(number, sumOfFactors);
        boolean isStrong = isStrongNumber(number);
        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);
        System.out.println("Is Perfect Number: " + isPerfect);
        System.out.println("Is Abundant Number: " + isAbundant);
        System.out.println("Is Deficient Number: " + isDeficient);
        System.out.println("Is Strong Number: " + isStrong);
    }
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // The greatest proper factor is second last element
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number, int sumOfFactors) {
        return sumOfFactors - number == number;
    }
    public static boolean isAbundantNumber(int number, int sumOfFactors) {
        return sumOfFactors - number > number;
    }
    public static boolean isDeficientNumber(int number, int sumOfFactors) {
        return sumOfFactors - number < number;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
