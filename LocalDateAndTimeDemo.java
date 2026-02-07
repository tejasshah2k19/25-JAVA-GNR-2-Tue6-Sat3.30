
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateAndTimeDemo {
    
    public static void main(String[] args) {
        
        LocalDate today  = LocalDate.now();  
        System.out.println(today);

        LocalDateTime todayDateTime = LocalDateTime.now(); 
        System.out.println(todayDateTime);

        LocalDate after85 =  today.plusDays(85);
        System.out.println(after85);

        LocalDate after25 =  today.plus(25, ChronoUnit.DAYS);
        System.out.println(after25);

        //date of birth input -> age | days 


            //31-Jan-1990

            LocalDate bDate =  LocalDate.of(1990, 1, 31);

            Period diff = Period.between(today,bDate);

            System.out.println(diff.getYears());
            


    }
}
