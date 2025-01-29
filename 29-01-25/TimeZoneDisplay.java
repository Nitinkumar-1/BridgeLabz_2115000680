import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZoneDisplay {
    public static void main(String[] args) {
        displayTimeInZone("GMT");
        displayTimeInZone("Asia/Kolkata"); // IST
        displayTimeInZone("America/Los_Angeles"); // PST
    }
    public static void displayTimeInZone(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current time in " + zone + ": " + time.format(formatter));
    }
}
