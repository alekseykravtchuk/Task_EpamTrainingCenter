package by.krava.etc.learn_by.collection;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>() {
            {
                this.add("one");
                this.add("two");
                this.add("ten");
            }
        };

        System.out.println(set);

    }
}
