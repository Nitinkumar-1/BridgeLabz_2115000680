import java.util.Scanner;
public class level1Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm;
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54;
              int heightFeet = (int) (heightInches / 12);
        double remainingInches = heightInches % 12;
        System.out.println("Your Height in cm is " + String.format("%.2f", heightCm) +    " while in feet is " + heightFeet +" and inches is " + String.format("%.2f", remainingInches)     );
        input.close();
    }
}
