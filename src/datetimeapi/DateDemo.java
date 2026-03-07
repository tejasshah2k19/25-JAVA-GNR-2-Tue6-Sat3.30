package datetimeapi;
import java.util.Date; 

public class DateDemo {
    public static void main(String[] args) {
        
        Date d= new Date();
        System.out.println(d);//Tue Jan 27 18:15:05 IST 2026
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
    }
}
