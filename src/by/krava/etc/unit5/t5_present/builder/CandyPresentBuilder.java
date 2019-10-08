package by.krava.etc.unit5.t5_present.builder;

import by.krava.etc.unit5.t5_present.action.CustomerAction;
import by.krava.etc.unit5.t5_present.entity.Wrap;
import java.util.ArrayList;


public class CandyPresentBuilder extends PresentBuilder {

    @Override
    void buildName() {
        String name = CustomerAction.checkInputName();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("What price do you want to buy a gift for?");
        double price = CustomerAction.checkInputPrice();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = CustomerAction.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<>());
    }
}
