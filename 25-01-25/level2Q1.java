import java.util.Scanner;
public class level2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Enter details for Employee " + (i + 1) + ":");
                System.out.print("Enter years of service (positive integer): ");
                yearsOfService[i] = scanner.nextInt();
                System.out.print("Enter salary (positive number): ");
                salaries[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0 || salaries[i] < 0) {
                    System.out.println("Invalid input. Please enter positive values.");
                } else {
                    validInput = true; 
                }
            }
        }
        for (int i = 0; i < 10; i++) {
               if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; 
            } else {
                bonuses[i] = salaries[i] * 0.02; 
            }
            newSalaries[i] = salaries[i] + bonuses[i];
                        totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nTotal Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary (after bonuses): $" + totalNewSalary);
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: $" + salaries[i] + ", Bonus: $" + bonuses[i] + ", New Salary: $" + newSalaries[i]);
        }

        scanner.close();
    }
}
