package by.krava.etc.learn_by.collection;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(new PersonNameComparator());
        set.add(new Person(225, "Bob"));
        set.add(new Person(535, "Jack"));
        set.add(new Person(817, "Robin"));
        set.add(new Person(109, "Peter"));
        System.out.println(set);
    }
}
