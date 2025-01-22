import java.util.Scanner;
        public class level1Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = sc.nextDouble();
              double areaInches = 0.5 * baseInches * heightInches;
         double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;
              double areaCm = 0.5 * baseCm * heightCm;
        double heightFeet = heightInches / 12;
        double heightInchesRemaining = heightInches % 12;
            System.out.println("Area of the triangle in square inches: " + areaInches + " square inches");
        System.out.println("Area of the triangle in square centimeters: " + areaCm + " square centimeters");
            System.out.println("Your height in centimeters is " + heightCm + " cm while in feet is " + heightFeet + " feet and inches is " + heightInchesRemaining + " inches.");
    }
}
