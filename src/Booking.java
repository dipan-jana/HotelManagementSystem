import java.util.Random;
import java.util.Scanner;

public class Booking {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    private int bookingId;
    private int hotelID;


    public int getBookingId() {

        bookingId = random.nextInt();
        return bookingId;
    }

    public void setBookingId(int bookingId) {

        this.bookingId = bookingId;
    }
    public Booking() {
        this.setBookingId(bookingId);
    }
}
