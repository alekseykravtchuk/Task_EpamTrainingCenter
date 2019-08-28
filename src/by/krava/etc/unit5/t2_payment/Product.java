package by.krava.etc.unit5.t2_payment;

public class Product {
    private String name;
    private int vendorCode;
    private double price;

    public Product(String name, int vendorCode, double price) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, code: %d, price: $ %.2f", name, vendorCode, price);
    }
}
