
import java.util.Scanner;

public class SmartParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 5;
        int parked = 0;

        while (true) {
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit Program");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (parked < capacity) {
                        parked++;
                        System.out.println("Vehicle Parked. Total: " + parked);
                    } else {
                        System.out.println("Parking Full.");
                    }
                    break;
                case 2:
                    if (parked > 0) {
                        parked--;
                        System.out.println("Vehicle Exited. Total: " + parked);
                    } else {
                        System.out.println("No vehicles to exit.");
                    }
                    break;
                case 3:
                    System.out.println("Occupied: " + parked + "/" + capacity);
                    break;
                case 4:
                    System.out.println("Exiting System.");
                    return;
                default:
                    System.out.println("Invalid Option.");
            }
        }
    }
}

