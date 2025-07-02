enum RideType {
    NORMAL(10, 1, 5),
    PREMIUM(15, 2, 20);

    public final int costPerKm;
    public final int costPerMin;
    public final int minFare;

    RideType(int costPerKm, int costPerMin, int minFare) {
        this.costPerKm = costPerKm;
        this.costPerMin = costPerMin;
        this.minFare = minFare;
    }
}

class Ride {
    public final double distance;
    public final int time;
    public final RideType type;

    public Ride(double distance, int time, RideType type) {
        this.distance = distance;
        this.time = time;
        this.type = type;
    }
}

class InvoiceSummary {
    public final int totalRides;
    public final double totalFare;
    public final double averageFare;

    public InvoiceSummary(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = totalFare / totalRides;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) obj;
        return totalRides == that.totalRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
}

class InvoiceGenerator {
    public double calculateFare(Ride ride) {
        double fare = ride.distance * ride.type.costPerKm + ride.time * ride.type.costPerMin;
        return Math.max(fare, ride.type.minFare);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}

import java.util.*;

class RideRepository {
    private final Map<String, List<Ride>> userRides = new HashMap<>();

    public void addRides(String userId, Ride[] rides) {
        userRides.put(userId, Arrays.asList(rides));
    }

    public Ride[] getRides(String userId) {
        return userRides.get(userId).toArray(new Ride[0]);
    }
}

class InvoiceService {
    private final RideRepository rideRepository = new RideRepository();
    private final InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    public InvoiceSummary getInvoice(String userId) {
        Ride[] rides = rideRepository.getRides(userId);
        return invoiceGenerator.calculateFare(rides);
    }
}

public class CabInvoiceApp {
    public static void main(String[] args) {
        InvoiceService service = new InvoiceService();
        Ride[] user1Rides = {
                new Ride(2.0, 5, RideType.NORMAL),
                new Ride(0.1, 1, RideType.NORMAL),
                new Ride(5.0, 10, RideType.PREMIUM)
        };
        service.addRides("user1", user1Rides);
        InvoiceSummary invoice = service.getInvoice("user1");
        System.out.println("Total Rides: " + invoice.totalRides);
        System.out.println("Total Fare: " + invoice.totalFare);
        System.out.println("Average Fare: " + invoice.averageFare);
    }
}

