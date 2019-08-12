package by.krava.etc.unit4.aggregation_and_composition.t05_travel_voucher;

public class TourPackage {
    private String country;
    private String city;
    private TourPackageType type;
    private Transport transport;
    private TypeOfFood food;
    private int numberOfDays;
    private double price;

    public TourPackage(String country, String city, TourPackageType type, Transport transport, TypeOfFood food, int numberOfDays, double price) {
        this.country = country;
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TourPackageType getType() {
        return type;
    }

    public void setType(TourPackageType type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public void setFood(TypeOfFood food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
