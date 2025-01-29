import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        displayFormattedDate(currentDate, "dd/MM/yyyy");
        displayFormattedDate(currentDate, "yyyy-MM-dd");
        displayFormattedDate(currentDate, "EEE, MMM dd, yyyy");
    }
    public static void displayFormattedDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(date.format(formatter));
    }
}
