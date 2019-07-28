package by.krava.etc.unit4.simple_object.t04_train;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен поль-
 * зователем. Добавьте возможность сортировки массив по пункту назначения, при-
 * чем поезда с одинаковыми пунктами назначения должны быть упорядочены по вре-
 * мени отправления.
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

    private String destination;
    private String trainNumber;
    private Date departureTime;
    private static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    private Train(String destination, String trainNumber, Date departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    private static void sortTrainNumber(Train [] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].trainNumber.compareTo(trains[j].trainNumber) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    private static void sortTrainDestination(Train [] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].destination.compareTo(trains[j].destination);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[j].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    private static String printTrainInformation(Train [] trains, String trainNumber) {

        for (Train train : trains) {
            if (train.trainNumber.equalsIgnoreCase(trainNumber)) {
                return "destination: " + train.destination +
                       ", departure time: " + ft.format(train.departureTime);
            }
        }
        return null;
    }

    public static void main(String[] args) throws ParseException {
        Train [] trains = new Train[5];
        trains[0] = new Train("Minsk", "726Б", ft.parse("18:58"));
        trains[1] = new Train("Grodno", "673Б", ft.parse("11:48"));
        trains[2] = new Train("Riga", "031К", ft.parse("13:50"));
        trains[3] = new Train("Grodno", "094Ш", ft.parse("15:40"));
        trains[4] = new Train("Kiev", "764ДОШ", ft.parse("05:40"));

        sortTrainNumber(trains);
        //проверка сортировки по номерам
        for (Train train : trains) {
            System.out.println(train.trainNumber);
        }

        //вывод информации о поезде по его номеру
        String request = "673Б";
        System.out.printf("%nTrain #%s, ", request);
        System.out.println(printTrainInformation(trains, request) + "\n");

        sortTrainDestination(trains);
        //проверка сортировки по пункту назначения
        for (Train train : trains) {
            System.out.println(train.destination + " " + train.trainNumber + " - " + ft.format(train.departureTime));
        }
    }

}
