import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            double fahrenheit = takeInput("Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(fahrenheit, "Fahrenheit", celsius, "Celsius");
        } else if (choice == 2) {
            double celsius = takeInput("Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(celsius, "Celsius", fahrenheit, "Fahrenheit");
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }
    }
    public static double takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void displayResult(double inputTemp, String inputUnit, double convertedTemp, String convertedUnit) {
        System.out.printf("%.2f %s is %.2f %s.%n", inputTemp, inputUnit, convertedTemp, convertedUnit);
    }
}
