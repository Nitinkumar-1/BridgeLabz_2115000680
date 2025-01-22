import java.util.Scanner;

public class level2Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
              System.out.print("Enter the city you are traveling from: ");
        String fromCity = scanner.nextLine();
              System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();
             System.out.print("Enter the city you are traveling to: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter the distance from your city to the via city in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from the via city to the final city in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter the total time taken for the trip in hours: ");
        double timeTaken = scanner.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.printf("Traveler: %s%n", name);
        System.out.printf("Route: %s -> %s -> %s%n", fromCity, viaCity, toCity);
        System.out.printf("Total Distance: %.2f miles%n", totalDistance);
        System.out.printf("Time Taken: %.2f hours%n", timeTaken);
        System.out.printf("Average Speed: %.2f miles/hour%n", averageSpeed);
        System.out.print("Enter a fee amount in INR: ");
        int fee = scanner.nextInt();

     System.out.print("Enter a discount percentage: ");
        int discountPercent = scanner.nextInt();

        int discountAmount = (fee * discountPercent) / 100;
        int discountedFee = fee - discountAmount;
        int doubleFee = fee * 2;
        System.out.printf("The results of Int Operations are %d, %d, and %d.%n", discountAmount, discountedFee, doubleFee);
        scanner.close();
    }
}
