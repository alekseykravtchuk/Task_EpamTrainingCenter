package by.krava.etc.unit5.t5_present.entity;

import java.util.List;

public class Present {
    private String name;
    private int weight;
    private double price;
    private Wrap wrap;
    private List<Product> products;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public List<Product> getProducts() {
        return products;
    }

    String getProductsLine() {
        if(products.size() == 0) {
            return ".";
        }
        StringBuilder sb = new StringBuilder(".\nProducts list:\n");
        for (Product product : products) {
            sb.append(product).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Present for " + getName() + ':' +
                " content's weight = " + getWeight() +
                " gram, price = " + String.format("%.2f", getPrice()) +
                " ruble, wrap - " + getWrap() + getProductsLine();

    }
}
