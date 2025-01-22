public class level1Q3 {
    public static void main(String[] args) {
             double distanceKm = 10.8;
          double kmToMiles = 1 / 1.6;
              double distanceMiles = distanceKm * kmToMiles;
        System.out.printf("The distance %.1f km in miles is %.2f", distanceKm, distanceMiles);
    }
}
