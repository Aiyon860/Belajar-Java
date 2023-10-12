package DateCalenderClass;

import java.util.Date;
import java.util.Calendar;

public class DateCalenderApp {
    public static void main(String[] args) {
        //# Represent date by using Date Class
        // normal format // can use long format too (look at the Date class)
        Date date = new Date();
        System.out.println(date);

        // milisecond format
        Long miliSecond = date.getTime();
        System.out.println(miliSecond);

        //# Manipulate date by using Calender Class
        Calendar calendar = Calendar.getInstance();

        // normal format
        Date tanggal = calendar.getTime();
        System.out.println(tanggal);

        // milisecond format
        Long tanggalLong = calendar.getTimeInMillis();
        System.out.println(tanggalLong);

        // // Real manipulating by using Calender Class
        Calendar calendarManipulate = Calendar.getInstance();
        calendarManipulate.set(Calendar.YEAR, 2030);
        // calendarManipulate.add(Calendar.YEAR, 10);
        // calendarManipulate.add(Calendar.YEAR, -10);

        calendarManipulate.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendarManipulate.set(Calendar.DAY_OF_MONTH, 5);
        calendarManipulate.set(Calendar.HOUR_OF_DAY, 12);
        calendarManipulate.set(Calendar.MINUTE, 1);
        calendarManipulate.set(Calendar.SECOND, 1);
        calendarManipulate.set(Calendar.MILLISECOND, 0);

        Date dateManipulate = calendarManipulate.getTime();
        System.out.println(dateManipulate);

        Long dateManipulateLong = dateManipulate.getTime();
        System.out.println(dateManipulateLong);
    }
}
