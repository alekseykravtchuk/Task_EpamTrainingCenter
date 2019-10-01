package by.krava.etc.learn_by.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, new Locale("be", "BY"));
//        String dateStr = dateFormat.format(new Date());
//        System.out.println(dateStr);

        try {
            Date date = dateFormat.parse("пятніца, 6, верасня 2019 12.25.23");
            System.out.println(date);
            DateFormat dateFormatCa = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.CANADA_FRENCH);
            System.out.println(dateFormatCa.format(date));
            DateFormat dateFormatFr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.CHINESE);
            System.out.println(dateFormatFr.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
