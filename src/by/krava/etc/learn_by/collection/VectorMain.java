package by.krava.etc.learn_by.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(777);
        vector.add("java");
        vector.add("belarus");
        vector.add(1, null);
        vector.addAll(vector);
        vector.removeIf(e -> e== null);
        vector.replaceAll(String::toUpperCase);
        System.out.println(vector);
        long size = vector.stream().count();
        System.out.println(size);
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement());
        }
    }
}
