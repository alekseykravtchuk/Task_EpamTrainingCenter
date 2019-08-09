package by.krava.etc.unit4.aggregation_and_composition.t03_state;

import java.util.ArrayList;

class Region {
    private String regionalName;
    private City regionalCenter;
    private double area; //kkm
    private ArrayList<District> districts;

    Region(String regionalName, City regionalCenter, double area) {
        this.regionalName = regionalName;
        this.regionalCenter = regionalCenter;
        this.area = area;
        this.districts = new ArrayList<>();
    }

    double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    int getPopulation () {
        int population = 0;
        for (District district : this.districts) {
            population += district.getDistrictCenter().getPopulation();
        }
        return population;
    }

    void addDistrict (District district) {
        districts.add(district);
    }

    void removeDistrict (String districtName) {
        for (District district : districts) {
            if (districtName.equals(district.getDistrictName())) {
                districts.remove(district);
            }
        }
    }

    City getRegionalCenter() {
        return regionalCenter;
    }

    void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    ArrayList<District> getDistricts() {
        return districts;
    }

    void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    String getRegionalName() {
        return regionalName;
    }
}
