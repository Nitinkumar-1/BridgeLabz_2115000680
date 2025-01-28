import java.util.Scanner;
public class level1Q2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        int handshakes = calculateHandshakes(students);
        System.out.println("The maximum number of handshakes among " + students + " students is " + handshakes);
        scanner.close();
    }
}
