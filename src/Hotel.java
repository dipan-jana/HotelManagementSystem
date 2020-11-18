import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Hotel {

    private static Scanner scanner = new Scanner(System.in);


    public int hotelID;
    public String hotelName;
    public String city;
    public String landmark;
    public int numberRooms;
    Facility facilities;


//    public String getHotelName() {
//
//        return hotelName;
//    }
//
//    public void setHotelName(String hotelName) {
//
//        this.hotelName = hotelName;
//    }
    public int getHotelID() {
        System.out.print("\nEnter the Hotel ID you want to Book: ");
        hotelID = scanner.nextInt();
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
        //System.out.print("\nYour Hotel ID is: " + this.hotelID);
    }
    public int getNumberRooms() {
        System.out.print("\nEnter the Number of Rooms you want to Book: ");
        numberRooms = scanner.nextInt();
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public String getCity() {
        System.out.print("\nEnter the City where you want to book: ");
        city = scanner.nextLine();
        return city;
    }

    public void setCity(String city) {

        this.city = city;

    }
    public void Hotel (String city) {
        this.city = city;
    }

    public void getConnection() {
        Connection c = null;
        try {
            c = PostgresManager.getConnection();
            String queryCheck = "select hotelname,rooms,hotelid,landmark from hotel" + " where city=?";
            PreparedStatement ps = c.prepareStatement(queryCheck);
            ps.setString(1, this.city); //1 specifies the first parameter in the query
            ResultSet resultSet = ps.executeQuery();


            while (resultSet.next()) {
                System.out.print("\n\tHotel Name: " + resultSet.getString(1));
                System.out.print("\n\tNumber of Rooms: " + resultSet.getString(2));
                System.out.print("\n\tHotel ID: " + resultSet.getString(3));
                System.out.print("\n\tLandmark: " + resultSet.getString(4));
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Hotel(int hotelID, int numberRooms) {
        this.hotelID = hotelID;
        this.numberRooms = numberRooms;
    }
}

