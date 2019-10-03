package by.krava.etc.learn_by.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Student());
        list.add(new Student());
    }
}
