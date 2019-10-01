package by.krava.etc.unit5.t3_calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2020);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy", new Locale("be", "BY"));

        calendar.addHoliday(LocalDate.parse("01.01.2020", dtf), "New Year");
        calendar.addHoliday(LocalDate.parse("07.01.2020", dtf), "Orthodox Christmas");
        calendar.addHoliday(LocalDate.parse("08.03.2020", dtf), "Women’s Day");
        calendar.addHoliday(LocalDate.parse("01.05.2020", dtf), "Labour Day");
        calendar.addHoliday(LocalDate.parse("09.05.2020", dtf), "Victory Day");
        calendar.addHoliday(LocalDate.parse("03.07.2020", dtf), "Independence Day");
        calendar.addHoliday(LocalDate.parse("07.11.2020", dtf), "October Revolution Day");
        calendar.addHoliday(LocalDate.parse("25.12.2020", dtf), "Catholic Christmas");

        calendar.printHolidays();

        Calendar.Holiday holiday = calendar.removeHoliday("October Revolution Day");
        System.out.println("\nremoved holiday " + holiday);
    }
}
