import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = takeInput("Enter the first date (yyyy-MM-dd): ");
        LocalDate date2 = takeInput("Enter the second date (yyyy-MM-dd): ");
    compareDates(date1, date2);
    }
    public static LocalDate takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String dateString = scanner.nextLine();
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is the same as " + date2);
        }
    }
}
