import java.util.Scanner;

public class Room {
    int roomno;
    int hotelid;
    RoomType roomType;
    Scanner scanner = new Scanner(System.in);


    public RoomType getRoomType() {
        System.out.println("BOOK A ROOM: ");
        roomType = setRoom();
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void Room(RoomType roomType) {
        this.setRoomType(roomType);
    }



    public RoomType setRoom() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To Book a SINGLE");
        System.out.println("\t 2 - To Book a DOUBLE");
        System.out.println("\t 3 - To Book a SUITE");
        System.out.print("\nEnter the Room Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                return RoomType.SINGLE;
            case 2:
                return RoomType.DOUBLE;
            case 3:
                return RoomType.SUITE;
            default:
                System.out.print("PLEASE ENTER A VALID CHOICE....");
                break;
        }
        return null;
    }



}
