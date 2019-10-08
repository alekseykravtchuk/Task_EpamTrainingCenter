package by.krava.etc.unit5.t5_present.entity;

public enum CandyType implements Type {
    CARAMEL("Caramel", 10),
    CHOCOLATE("Chocolate", 25),
    GUMMIES("Gummies", 15),
    LICORICE("Licorice", 20);
    private String name;
    private int price;

    CandyType(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
