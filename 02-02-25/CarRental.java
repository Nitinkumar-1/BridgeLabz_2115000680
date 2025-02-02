public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 50.0;
    }
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public int getRentalDays() {
        return rentalDays;
    }
    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Alice Johnson", "Toyota Camry", 5, 40.0);
        rental1.displayRentalInfo();
    }
}
