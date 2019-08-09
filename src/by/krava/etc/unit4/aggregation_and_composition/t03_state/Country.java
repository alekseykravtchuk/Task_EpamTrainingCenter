package by.krava.etc.unit4.aggregation_and_composition.t03_state;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    Country(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    void printNumberOfRegions() {
        System.out.printf("There are %d regions in %s.\n", this.regions.size(), countryName);
    }

    void printCapital() {
        System.out.printf("The capital of %s is %s.\n", countryName, capital);
    }

    void printArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        System.out.printf("The area of %s is %.3f thousand square kilometers.\n", countryName, area);
    }
    void printRegioCenters () {
        System.out.printf("Regional centers of the %s: ", countryName);
        for (Region region : regions) {
            System.out.print(region.getRegionalName() + ", ");
        }
        System.out.println("\b\b.");
    }

    void addRegion (Region region) {
        regions.add(region);
    }

    void removeRegion (String regionName) {
        for (Region region : regions) {
            if (regionName.equals(region.getRegionalName())) {
                regions.remove(region);
            }
        }
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
