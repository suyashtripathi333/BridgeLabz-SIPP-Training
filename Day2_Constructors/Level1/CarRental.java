package Day2_Constructors.Level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    CarRental() {
        this("Customer", "ModelX", 1, 1000.0);
    }

    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    double totalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Neha", "Swift", 4, 1200.0);
        System.out.println(r.customerName + " " + r.carModel + " " + r.totalCost());
    }
}

