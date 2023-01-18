package vanilla_java.introduction.java_date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Result {

    public static String findDay(int month, int day, int year) {
        Date date = new Date();
        SimpleDateFormat originalFormat = new SimpleDateFormat("MMddyyyy");
        String string = String.valueOf(month).length() > 1 ? String.valueOf(month) : "0" + String.valueOf(month);
        string += String.valueOf(day).length() > 1 ? String.valueOf(day) : "0" + String.valueOf(day);
        string += String.valueOf(year);

        try {
            date = originalFormat.parse(
                    string
            );
        } catch (ParseException e) {
            System.out.println("PANIC");
        }

        Map<Integer, String> days = new HashMap<>();
        days.put(0, "SUNDAY");
        days.put(1, "MONDAY");
        days.put(2, "TEUSDAY");
        days.put(3, "WEDNESDAY");
        days.put(4, "THURSDAY");
        days.put(5, "FRIDAY");
        days.put(6, "SATURDAY");

        return days.get(date.getDay());
    }

}
