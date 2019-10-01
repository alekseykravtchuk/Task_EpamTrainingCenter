package by.krava.etc.learn_by.collection;

import java.util.EnumSet;

import static by.krava.etc.learn_by.collection.Country.*;

public class EnumSetCountryMain {
    public static void main(String[] args) {
        EnumSet<Country> asianCountry = EnumSet.of(ARMENIA, INDIA, KAZAKHSTAN);
        String nameCountry = "Belarus";
        Country current = Country.valueOf(nameCountry.toUpperCase());
        if (asianCountry.contains(current)) {
            System.out.println("Asia Action");
        }
        asianCountry.forEach(c -> c.grow(1));

    }
}
