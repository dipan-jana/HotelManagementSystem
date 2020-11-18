import java.util.Scanner;

public class Booking {

    Scanner scanner = new Scanner(System.in);


    private int bookingId;
    private int hotelID;


    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
