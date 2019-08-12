package by.krava.etc.unit4.aggregation_and_composition.t05_travel_voucher;

public enum TourPackageType {
    RECREATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUISE;


    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
