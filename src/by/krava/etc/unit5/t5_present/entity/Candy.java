package by.krava.etc.unit5.t5_present.entity;

public class Candy extends Product {
    private CandyType candyType;

    public Candy(String name, int weight, double price, CandyType candyType) {
        super(name, weight, price);
        this.candyType = candyType;
    }

    @Override
    public Type getType() {
        return candyType;
    }
    @Override
    public String toString() {
        return getType().getName() +
                " \"" + getName() + '\"' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() + " ruble;";
    }


}


