package by.krava.etc.unit4.aggregation_and_composition.t02_car;

public class Engine {
    private int power;
    private double volume;

    Engine(int power, double volume) {
        this.power = power;
        this.volume = volume;
    }

    int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    double getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
