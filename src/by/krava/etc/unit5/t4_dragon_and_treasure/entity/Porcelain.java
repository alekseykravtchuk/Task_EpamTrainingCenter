package by.krava.etc.unit5.t4_dragon_and_treasure.entity;

public class Porcelain extends Treasure {

    private String descriptionOfTreasure;

    public Porcelain(String name, int value, String descriptionOfTreasure) {
        super.setName(name);
        super.setValue(value);
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String getDescriptionOfTreasure() {
        return descriptionOfTreasure;
    }

    @Override
    public void setDescriptionOfTreasure(String descriptionOfTreasure) {
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-40s value: %-5d description: %-40s", "Porcelain:", super.getName(), super.getValue(),descriptionOfTreasure);
    }
}
