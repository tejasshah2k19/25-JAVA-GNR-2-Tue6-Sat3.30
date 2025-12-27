
import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        String dbUserName = "tejas";
        String dbPwd = "Java123";

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter username and password");
        String userName = scr.next();
        String password = scr.next();

        userName = userName.toLowerCase();

        if (userName.length() < 5) {
            System.out.println("Username must be grater than 5 character");
        } else if (userName.equals("admin")) {
            System.out.println("Username must not be ADMIN ");
        } else if (userName.startsWith("admin") || userName.endsWith("admin")) {
            System.out.println("Username must not be start or ends with admin");
        } else if (userName.equals(dbUserName) && password.equals(dbPwd)) {
            System.out.println(userName.toUpperCase());
            System.out.println(userName.length());
        } else {
            System.out.println("Invalid Credentials....");
        }

    }
}
