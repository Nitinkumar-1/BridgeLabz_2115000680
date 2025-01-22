public class level1Q4 {
    public static void main(String[] args) {
        int CP = 129;
        int SP = 191;
        int profit = SP - CP;
        double profitPercentage = ((double) profit / CP) * 100;

      
        System.out.println(
            "The CP is INR " + CP + 
            " and SP is INR " + SP + ".\n" +
            "Profit = INR " + profit + ".\n" +
            "Profit Percentage = " + String.format("%.2f", profitPercentage) + "%"
        );
    }
}
