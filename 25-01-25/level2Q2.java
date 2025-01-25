import java.util.Scanner;
public class level2Q2 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
    System.out.println("\nYoungest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
   System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
                 scanner.close();
    }
}
