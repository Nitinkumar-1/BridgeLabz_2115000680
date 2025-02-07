class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        System.out.println(ev.displayType());
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250);
        System.out.println(pv.displayType());
        pv.refuel();
    }
}

class Vehicle {
    String model;
    int maxSpeed;
    
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    
    String displayType() {
        return "General Vehicle";
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    
    @Override
    String displayType() {
        return "Electric Vehicle: " + model;
    }
    
    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    
    @Override
    String displayType() {
        return "Petrol Vehicle: " + model;
    }
    
    @Override
    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

