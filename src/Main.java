import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("\nEnter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    bookHotel();
                    break;
                case 2:
                    System.out.println("Updating...");
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {

        System.out.println("\n\t****************** HOTEL BOOKING APPLICATION ******************");
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print the Choice Options.");
        System.out.println("\t 1 - To Book a Hotel.");
        System.out.println("\t 2 - To Cancel a Booking");
        System.out.println("\t 3 - To Quit the Application.");
    }

    public static void bookHotel() throws Exception {

        User userObject = new User();

        System.out.println("\n\t****************** PLEASE PROVIDE USER DETAILS ******************");

        userObject.User(userObject.getUserId(), userObject.getName(), userObject.getMobileNumber(), userObject.getGender(), userObject.getDurationObject());
        userObject.userDetails();

        Hotel hotelObject = new Hotel();
        hotelObject.Hotel(hotelObject.getCity());
        hotelObject.getConnection();
        hotelObject.Hotel(hotelObject.getHotelID(), hotelObject.getNumberRooms());

        Room roomObject = new Room();
        roomObject.setRoomType(roomObject.getRoomType());


//        System.out.print("\nEnter the User ID: ");
//        int userID = scanner.nextInt();
//        scanner.nextLine();
//        userObject.setUserId(userID);
//
//        System.out.print("Enter the User Name: ");
//        String userName = scanner.nextLine();
//        userObject.setName(userName);
//
//        System.out.print("Enter the Mobile Number: ");
//        String userMobile = scanner.nextLine();
//        userObject.setMobileNumber(userMobile);
//
//        System.out.print("Enter your Gender: ");
//        String userGender = scanner.nextLine();
//        userObject.setGender(userGender);
//
//        userObject.userDetails();
        //userObject.displayDate();

//




//        String getCity =
//        hotelObject.setCity(getCity);
//        System.out.println(getCity);

//        System.out.print("Enter the Number of Rooms you want to Book: ");
//        int roomNumber = scanner.nextInt();
//        hotelObject.setNumberRooms(roomNumber);





//        System.out.println("\n\t****************** PLEASE PROVIDE BOOKING DETAILS ******************");
//
//        Booking bookingObject = new Booking();
//        bookingObject.bookHotel();


    }
}


//
//
//        System.out.print("Enter the User ID: ");
//        int userID = scanner.nextInt();
//        scanner.nextLine();
//        userObject.setUserId(userID);

//        Duration durationObject = new Duration();
//        durationObject.getDate();

//        Address ad=new Address();
//
//        Duration d=new Duration();
//
//        PaymentStatus ps=PaymentStatus.PAID;
//        PaymentStatus pk=PaymentStatus.UNPAID;
//         System.out.println(s.userId+s.gender+s.mobno+s.name);
//        System.out.println(ad.pincode+ad.city+ad.state+ad.landmark);
//        System.out.println(h.adress+h.hotelname+h.facilities+h.hotelId+h.rating+h.rooms);
//        System.out.println(d.Days);
//        System.out.println(bk.bookingId + bk.hotelId + bk.userId + bk.amount + bk.amount+ps.toString());
//        System.out.println(ps);




//
//
//
//


