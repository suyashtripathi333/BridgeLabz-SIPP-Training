package Day1_OOPS.Level1;

import java.util.Scanner;

public class ItemInventory {
    int itemCode;
    String itemName;
    double price;

    void setItem(int code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    double calculateTotal(int quantity) {
        return quantity * price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemInventory item = new ItemInventory();
        item.setItem(sc.nextInt(), sc.next(), sc.nextDouble());
        int quantity = sc.nextInt();
        item.displayDetails();
        System.out.println("Total Cost: " + item.calculateTotal(quantity));
    }
}

