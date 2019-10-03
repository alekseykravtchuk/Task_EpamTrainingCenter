package by.krava.etc.unit5.t4_dragon_and_treasure.entity;

public abstract class Treasure {
    private String name;
    private int value;
    private String descriptionOfTreasure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract String getDescriptionOfTreasure();

    public abstract void setDescriptionOfTreasure(String descriptionOfTreasure);

    @Override
    public abstract String toString();
}
