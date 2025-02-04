public class Vehicle {
    private static double registrationFee = 200.0; 
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("The provided object is not an instance of Vehicle.");
        }
    }
    public static void displayRegistrationFee() {
        System.out.println("Current Registration Fee: $" + registrationFee);
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("ABC123", "Nitin kumar", "Car");
        Vehicle vehicle2 = new Vehicle("XYZ456", "Nishant Kumar Singh", "Motorcycle");
        Vehicle.displayRegistrationFee();
        vehicle1.displayRegistrationDetails(vehicle1); 
        vehicle2.displayRegistrationDetails(vehicle2); 
        Vehicle.updateRegistrationFee(250.0);
        System.out.println("\nUpdated Registration Fee:\n");
        Vehicle.displayRegistrationFee();
        vehicle1.displayRegistrationDetails(vehicle1); 
        vehicle2.displayRegistrationDetails(vehicle2); 
    }
}
