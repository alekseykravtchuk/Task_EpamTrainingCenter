package by.krava.etc.unit5.t5_present.builder;

import by.krava.etc.unit5.t5_present.entity.Present;

public class PresentDirector {
    PresentBuilder presentBuilder;

    public void setPresentBuilder(PresentBuilder presentBuilder) {
        this.presentBuilder = presentBuilder;
    }

    public Present buildPresent() {
        presentBuilder.createPresent();
        presentBuilder.buildName();
        presentBuilder.buildPrice();
        presentBuilder.buildWrap();
        presentBuilder.buildProducts();
        return presentBuilder.getPresent();
    }

    public PresentBuilder getPresentBuilder() {
        return presentBuilder;
    }
}
