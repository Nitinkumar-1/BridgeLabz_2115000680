import java.util.Scanner;
public class level2Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();
        findRoots(a, b, c);
    }
       public static void findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
         if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots");
        }
    }
}
