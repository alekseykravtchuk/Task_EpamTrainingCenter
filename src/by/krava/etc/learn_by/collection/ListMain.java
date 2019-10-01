package by.krava.etc.learn_by.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(42);
        list.add(null);
        list.add(42);
        list.add(77);
        System.out.println(list);
        list.add(5, 87);
        System.out.println(list);
        Integer value = list.get(3);
        System.out.println(value);
        System.out.println(list.indexOf(42));
        System.out.println(list.remove(new Integer(42)) + " " + list);
        System.out.println(list.subList(1, 3));
    }
}
