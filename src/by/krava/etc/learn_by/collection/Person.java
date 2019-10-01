package by.krava.etc.learn_by.collection;

import java.util.Comparator;

public class Person {
    private int personId;
    private String name;

    public Person(){}
    public Person(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public static class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }

    //@Override
    //public int compareTo(Person o) {
//        int result = personId - o.personId;
//        int value = 0;
//        if (result > 0) {
//            value = 1;
//        } else if (result < 0) {
//            value = -1;
//        }
   //     return name.compareTo(o.name);
   // }
}
