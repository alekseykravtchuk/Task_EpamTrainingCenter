package by.krava.etc.unit5.t2_payment;

enum Currency {
    BYN("belarusian ruble", 2.1),
    USD("dollar", 1.0),
    EUR("euro", 0.91),
    RUB("russian ruble", 67.5);
    private String name;
    private double rate;

    Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
