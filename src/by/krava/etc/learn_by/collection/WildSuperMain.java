package by.krava.etc.learn_by.collection;

import java.util.ArrayList;
import java.util.List;

public class WildSuperMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        //students.sort(new PersonNameComparator());

//        action(students);
//        List<Person> people = new ArrayList<>();
//        action(people);

    }

    static void action(List<? super Student> list) {
        list.remove(0);
        list.add(new Student());
        //list.add(new Person());
    }
}
