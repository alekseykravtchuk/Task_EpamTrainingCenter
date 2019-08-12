package by.krava.etc.unit4.aggregation_and_composition.t05_travel_voucher;

public enum TypeOfFood {
    NOT_INCLUDET,
    BREAKFAST,
    ALL_INCLUSIVE;


    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
