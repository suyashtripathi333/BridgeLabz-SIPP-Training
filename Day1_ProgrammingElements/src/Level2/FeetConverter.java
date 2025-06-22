
import java.util.Scanner;

public class FeetConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        int distanceInFeet = sc.nextInt();
        
        // 1 yard = 3 feet, 1 mile = 1760 yards = 5280 feet
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInFeet / 5280.0;
        
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);
        sc.close();
    }
}
