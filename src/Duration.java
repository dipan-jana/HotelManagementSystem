import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Duration {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int days;

    public void getDate() throws Exception {

        System.out.println("\n\t****************** PLEASE PROVIDE DATES FOR BOOKING ******************");

        System.out.print("\nEnter Check-in Date: ");

        String entryDate = br.readLine();
        Date checkIn = new SimpleDateFormat("dd/MM/yyyy").parse(entryDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String checkDate = sdf.format(checkIn);

        System.out.println("Your Check-in Date is: " + checkDate);

        System.out.print("\nEnter Check-out Date: ");

        String outDate = br.readLine();
        Date checkOut = new SimpleDateFormat("dd/MM/yyyy").parse(outDate);
        SimpleDateFormat obj = new SimpleDateFormat("dd/MM/yyyy");
        String outingDate = obj.format(checkOut);

        System.out.println("Your Check-out Date is: " + outingDate);

    }


  //  private int days;

   // public static void getDate() {
//      Date date = new Date();
 //       System.out.println("Enter Check-in Date: ");
        //String entrydate = scanner.nextLine();
 //       System.out.println("Enter Check-out Date: ");
//      SimpleDateFormat sdf = new SimpleDateFormat("E dd/MM/yyyy").parse(entrydate);
//      System.out.println(sdf.format(date));



   // }
}



