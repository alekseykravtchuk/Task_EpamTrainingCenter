package by.krava.etc.learn_by.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(1000);
        words.add("8Y1");
        words.add("2Y");
        words.add("2Y2");
        words.add("8Y1");
        words.add("6Y");
        words.add("5Z");
        words.add("4Y4");
        System.out.println(words);
        for (String element : words) {
            System.out.print(element.hashCode() + " ");
        }
        TreeSet<String> treeSet = new TreeSet<>(words);
        //System.out.println(treeSet);

    }
}
