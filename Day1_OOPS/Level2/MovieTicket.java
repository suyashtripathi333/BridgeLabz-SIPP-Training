package Day1_OOPS.Level2;

import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double price) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket m = new MovieTicket();
        m.bookTicket(sc.next(), sc.nextInt(), sc.nextDouble());
        m.displayTicket();
    }
}
