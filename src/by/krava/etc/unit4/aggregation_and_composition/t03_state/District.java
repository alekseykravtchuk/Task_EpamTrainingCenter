package by.krava.etc.unit4.aggregation_and_composition.t03_state;

public class District {
    private String districtName;
    private City districtCenter;
    private double area;

    public District(String districtName, City districtCenter, double area) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
        this.area = area;
    }

    String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
