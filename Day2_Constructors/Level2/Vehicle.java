package Day2_Constructors.Level2;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2500.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aman", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(3000.0);
        Vehicle v2 = new Vehicle("Bina", "Bike");
        v2.displayVehicleDetails();
    }
}
