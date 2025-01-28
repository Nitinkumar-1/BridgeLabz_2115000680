import java.util.Random;
public class level3Q11 {
    public static void main(String[] args) {
        double[][] employeeData = generateSalaryAndYearsOfService(10);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displaySalaryDetails(employeeData, updatedData);
    }
    public static double[][] generateSalaryAndYearsOfService(int numEmployees) {
        double[][] employeeData = new double[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            double salary = 10000 + random.nextInt(90000);
            int yearsOfService = random.nextInt(11);
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
        }
        return updatedData;
    }
    public static void displaySalaryDetails(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Years of Service", "New Salary", "Bonus Amount");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonusAmount = updatedData[i][1];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;
            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f\n", (i + 1), oldSalary, yearsOfService, newSalary, bonusAmount);
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n", "TOTAL", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
