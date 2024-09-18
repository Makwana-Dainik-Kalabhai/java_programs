//* Calendar class is an abstract class

import java.util.*;
class MyCalendar {
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());

        //* getInstance() is static method of Calendar abstract class
        Calendar c = Calendar.getInstance(); 
        System.out.println("\n\n"+c);
        System.out.println("\nCalendar Type: "+c.getCalendarType());
        System.out.println("\nTime Zone: "+c.getTimeZone());
        System.out.println("\nTime: "+c.getTime());
        System.out.println("\nTime in Millis: "+c.getTimeInMillis());
        System.out.println("\nno. of Weeks in Current year: "+c.getWeeksInWeekYear());
        System.out.println("\nCurrent Year: "+c.getWeekYear());

        //***Year,mon,day,hour,min,sec
        c.set(2030, 12, 20, 3, 40, 30);
        System.out.println("\nc.set(2030, 12, 20, 3, 40, 30): "+c.getTime());


        // System.out.println("\nLast Day of Week: "+c.getLastDayOfWeek());

        // System.out.println("\n\nTime Zone for London...");
        // Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        // System.out.println("Calendar Type: "+c1.getCalendarType());
        // System.out.println("\nTime Zone: "+c1.getTimeZone());
    }
}