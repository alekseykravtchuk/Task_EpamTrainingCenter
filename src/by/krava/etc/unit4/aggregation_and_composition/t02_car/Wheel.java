package by.krava.etc.unit4.aggregation_and_composition.t02_car;

public class Wheel {
    private int diameter;
    private boolean isGood;

    Wheel(int diameter) {
        this.diameter = diameter;
        this.isGood = true;
    }

    int getDiameter() {
        return diameter;
    }

    boolean isGood() {
        return isGood;
    }

    public void setGoodWhell() {
        isGood = true;
    }

    void breakWheel() {
        this.isGood = false;
    }
}
