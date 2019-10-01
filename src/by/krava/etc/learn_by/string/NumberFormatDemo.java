package by.krava.etc.learn_by.string;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
        String source = "1.234,576";
        NumberFormat numberFormatUs = NumberFormat.getInstance(Locale.US);
        NumberFormat numberFormatFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double number = numberFormat.parse(source).doubleValue();
            System.out.println(number);
            String resultUs = numberFormatUs.format(number);
            System.out.println("US " + resultUs);
            String resultFr = numberFormatFr.format(number);
            System.out.println("FR " + resultFr);
            double numberUs = numberFormatUs.parse(source).doubleValue();
            System.out.println("US(parse) " + numberUs);
            double numberFr = numberFormatFr.parse(source).doubleValue();
            System.out.println("FR(parse) " + numberFr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
