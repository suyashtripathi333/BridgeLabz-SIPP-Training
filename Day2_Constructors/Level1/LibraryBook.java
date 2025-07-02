package Day2_Constructors.Level1;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Dune", "Herbert", 499.0);
        System.out.println(b.borrow());
        System.out.println(b.borrow());
    }
}
