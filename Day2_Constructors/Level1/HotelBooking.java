package Day2_Constructors.Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        this(h.guestName, h.roomType, h.nights);
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Ravi", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);
        System.out.println(h2.guestName + " " + h2.roomType + " " + h2.nights);
    }
}
