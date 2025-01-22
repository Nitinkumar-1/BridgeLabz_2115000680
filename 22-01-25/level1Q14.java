import java.util.Scanner;
       public class level1Q14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
               double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards
              System.out.println("The distance is " + distanceInYards + " yards.");
        System.out.println("The distance is " + distanceInMiles + " miles.");
    }
}
