package by.krava.etc.unit5.t5_present.entity;

public enum WrapType implements Type {
    CARDBOARD_BOX("Cardboard box", 1.5),
    METAL_BOX("Metal Box", 5.0),
    FOIL_POUCHES("Foil Pouch", 2),
    PLASTIC_BAG("Plastic Bag", 0.5);
    private String name;
    private double price;

    WrapType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
