package by.krava.etc.unit4.aggregation_and_composition.t03_state;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {

    public static void main(String[] args) {
        City minsk = new City("Minsk", 1_992_685);
        Country belarus = new Country("Belarus", minsk);

        belarus.addRegion(new Region("Minskaya oblast'", minsk, 39.854));
        belarus.addRegion(new Region("Brestskaya oblast'", new City("Brest", 343_985), 32.787));
        belarus.addRegion(new Region("Vitebskaya oblast'", new City("Vitebsk", 362_466), 40.051));
        belarus.addRegion(new Region("Gomel'skaya oblast'", new City("Gomel", 508_839), 40.372));
        belarus.addRegion(new Region("Grodnenskaya oblast'", new City("Grodno", 368_710), 25.127));
        belarus.addRegion(new Region("Mogilevskaya oblast'", new City("Mogilev", 380_440), 29.068));

        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegioCenters();
    }
}
