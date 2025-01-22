public class level1Q7{
    public static void main(String[] args) {
              double rKm = 6378;
                  double kmToMilesConversionFactor = 0.621371;
                  double volumeKm3 = (4.0 / 3) * Math.PI *Math.pow(rKm, 3);
                     double volumeMiles3 = volumeKm3 * Math.pow(kmToMilesConversionFactor, 3);                       System.out.println(
            "The volume of earth in cubic kilometers is " + String.format("%.2f", volumeKm3) +
            " and cubic miles is " + String.format("%.2f", volumeMiles3)
        );
    }
}
