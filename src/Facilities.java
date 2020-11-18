import java.util.List;
import java.util.Scanner;

public class Facilities {
    Scanner sc=new Scanner(System.in);
    Facility facilities;

    public Facilities(String facility) {
        facilities= Facility.valueOf(sc.next());
    }
}
