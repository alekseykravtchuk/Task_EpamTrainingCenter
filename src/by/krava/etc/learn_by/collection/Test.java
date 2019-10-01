package by.krava.etc.learn_by.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class Test {
    public static void main(String[] args) {
        final Collection<String> c = new HashSet<>();
        c.add("s1");
        c.add("s2");
        c.add("s3");
        Iterator i = c.iterator();
        i.next();
        i.remove();
        System.out.println(c);
        int b = 1;
    }
}