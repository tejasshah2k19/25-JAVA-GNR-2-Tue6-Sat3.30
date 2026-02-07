
import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        // System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));

        /*
        java.util.GregorianCalendar[time=1769518732997,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2026,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=27,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=28,SECOND=52,MILLISECOND=997,ZONE_OFFSET=19800000,DST_OFFSET=0] 
         */
    }
}
