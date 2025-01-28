import java.util.Scanner;
 public class level2Q3 {
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
            if (year < 1582) {
            System.out.println("The Leap Year program only works for year >= 1582.");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        scanner.close();
    }
}
