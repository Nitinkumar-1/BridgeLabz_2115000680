import java.util.Scanner;
       public class level2Q9 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
              System.out.print("Enter the length of the first side of the triangular park in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side of the triangular park in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side of the triangular park in meters: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        double perimeterInKm = perimeter / 1000;
                double totalDistance = 5.0; 
        double rounds = totalDistance / perimeterInKm;
               System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);
        scanner.close();
    }
}
