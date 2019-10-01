package by.krava.etc.learn_by.collection;

import java.util.ArrayList;

public class FuncComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(41, "Bob"));
        list.add(new Person(57, "Jack"));
        list.add(new Person(56, "Jack"));
        list.add(new Person(17, "Bob"));
        list.add(new Person(19, "Bob"));
        list.add(new Person(10, "Jack"));
        System.out.println(list);
        list.sort(((o1, o2) -> o1.getPersonId() - o2.getPersonId()));
        //list.sort(Comparator.comparing(Person::getName));
        //list.sort(Comparator.comparing(Person::getName).thenComparingInt(Person::getPersonId));
        System.out.println(list);
    }
}
