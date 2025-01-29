import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = takeInput("Enter a date (yyyy-MM-dd): ");
        LocalDate modifiedDate = inputDate.plusDays(7)
                                          .plusMonths(1)
                                          .plusYears(2)
                                          .minusWeeks(3);

        displayResult(inputDate, modifiedDate);
    }
    public static LocalDate takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String dateString = scanner.nextLine();
        return LocalDate.parse(dateString);
    }
    public static void displayResult(LocalDate original, LocalDate modified) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Original date: " + original.format(formatter));
        System.out.println("Modified date: " + modified.format(formatter));
    }
}
