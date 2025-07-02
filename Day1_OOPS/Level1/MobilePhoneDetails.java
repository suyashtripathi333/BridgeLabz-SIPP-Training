package Day1_OOPS.Level1;

import java.util.Scanner;

public class MobilePhoneDetails {
    String brand;
    String model;
    double price;

    void setDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhoneDetails phone = new MobilePhoneDetails();
        phone.setDetails(sc.next(), sc.next(), sc.nextDouble());
        phone.displayDetails();
    }
}

