import java.util.Scanner;

public class User {

    private int userId;
    private String userName;
    private String mobileNumber;
    private String gender;

    private static Scanner sc = new Scanner(System.in);

    public int getUserId() {
        System.out.print("\nEnter the UserID: ");
        userId = sc.nextInt();
        sc.nextLine();
        return userId;

    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        System.out.print("Enter the User Name: ");
        userName = sc.nextLine();
        return userName;
    }

    public void setName(String userName) {

        this.userName = userName;
    }

    public String getMobileNumber() {

        System.out.print("Enter the Mobile Number: ");
        mobileNumber = sc.nextLine();
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {

        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        System.out.print("Enter Your Gender: ");
        gender = sc.nextLine();
        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender.toUpperCase();
    }

    Duration durationObject = new Duration();

    public Duration getDurationObject() {
        return durationObject;
    }

    public Duration setDurationObject(Duration durationObject) throws Exception {
        durationObject.getDate();
        return durationObject;
    }

    public void User(int userId, String userName, String mobileNumber, String gender, Duration durationObject) throws Exception {

        this.setUserId(userId);
        this.setName(userName);
        this.setMobileNumber(mobileNumber);
        this.setGender(gender);
        this.setDurationObject(durationObject);

    }

    public void userDetails() throws Exception {
        System.out.println("\nYOUR USER DETAILS ARE:");
        System.out.println("\n\tUser ID: " + userId + "\n\tUser Name: " + userName + "\n\tMobile Number: " + mobileNumber + "\n\tGender: " + gender);

    }
}
