
import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit': ");
            String type = sc.next().toLowerCase();
            if (type.equals("exit")) break;

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            double price = 0;
            switch (type) {
                case "espresso": price = 120; break;
                case "latte": price = 150; break;
                case "cappuccino": price = 180; break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }

            double total = price * qty;
            double gst = total * 0.18;
            double finalBill = total + gst;

            System.out.println("Total: " + total);
            System.out.println("GST (18%): " + gst);
            System.out.println("Final Bill: " + finalBill);
        }
    }
}
