package by.krava.etc.unit5.t5_present.builder;

import by.krava.etc.unit5.t5_present.entity.Present;

public abstract class PresentBuilder {
    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildWrap();
    abstract void buildProducts();

    Present getPresent() {
        return present;
    }
}
