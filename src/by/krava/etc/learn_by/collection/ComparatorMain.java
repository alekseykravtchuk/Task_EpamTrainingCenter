package by.krava.etc.learn_by.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(225, "Bob"));
        list.add(new Person(535, "Jack"));
        list.add(new Person(17, "Robin"));
        list.add(new Person(109, "Peter"));
        System.out.println(list);
        //list.sort(new PersonNameComparator());
        Collections.sort(list, new Person.NameComparator());
        System.out.println(list);
    }
}
