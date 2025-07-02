package Day2_Constructors.Level2;

public class Product {
    String productName;
    double price;
    static int totalProducts;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Mouse", 499.0);
        Product p2 = new Product("Keyboard", 899.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}

