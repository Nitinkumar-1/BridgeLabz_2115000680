import java.util.Scanner;

public class level1Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 double fee, discountPercent;
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
              System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
               double discount = (fee * discountPercent) / 100;
                double discountedFee = fee - discount;
        System.out.println(
            "The discount amount is INR " + String.format("%.2f", discount) +
            " and final discounted fee is INR " + String.format("%.2f", discountedFee)
        );

           input.close();
    }
}
