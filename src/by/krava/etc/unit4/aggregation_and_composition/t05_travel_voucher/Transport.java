package by.krava.etc.unit4.aggregation_and_composition.t05_travel_voucher;

public enum Transport {
    PLANE,
    BUS,
    TRAIN,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}