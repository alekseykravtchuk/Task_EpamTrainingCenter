package by.krava.etc.unit4.simple_object.t10_airline;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конст рукторы, set- и get- методы
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *    Найти и вывести:
 *    a) список рейсов для заданного пункта назначения;
 *    b) список рейсов для заданного дня недели;
 *    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Minsk (MSQ)", new ArrayList<>());
        flightSchedule.addAirline("Berlin (SXF)", "B2 891", "Embraer RJ-175",
                                  Airline.ft.parse("12:15"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                                  DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Moscow (ZIA)", "B2 971", "Boeing 737-500",
                                  Airline.ft.parse("8:15"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Moscow (ZIA)", "B2 973", "Boeing 737-300",
                                  Airline.ft.parse("18:05"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Moscow (DME)", "B2 993", "Boeing 737-500",
                                  Airline.ft.parse("19:45"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                                  DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Moscow (SVO)", "SU 1833", "Sukhoi Superjet 100-95",
                                  Airline.ft.parse("20:30"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Moscow (VKO)", "UT 776", "Boeing 737-500",
                                  Airline.ft.parse("17:55"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        flightSchedule.addAirline("Brussels (CRL)", "B2 817", "Embraer 175",
                                  Airline.ft.parse("8:40"), new DayOfWeek[]{DayOfWeek.WEDNESDAY});
        flightSchedule.addAirline("Brussels (CRL)", "B2 817", "Embraer 175",
                                  Airline.ft.parse("9:35"), new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SATURDAY});
        flightSchedule.addAirline("Brussels (CRL)", "B2 817", "Embraer 175",
                                  Airline.ft.parse("13:00"), new DayOfWeek[]{DayOfWeek.MONDAY});
        flightSchedule.addAirline("Paris (CDG)", "B2 863", "Embraer 195",
                                  Airline.ft.parse("14:50"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY,
                                  DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});


        System.out.println("List of flights with destination Brussels (CRL):");
        ArrayList<Airline> airlinesToBrussels = flightSchedule.airlinesToDestination("Brussels (CRL)");
        for (Airline airline : airlinesToBrussels) {
            System.out.println(airline);
        }

        System.out.println("\nThe list of flights departing on Sunday:");
        ArrayList<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }

        System.out.println("\nList of flights departing after 13:00 Tuesday:");
        Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.MONDAY, time);
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}
