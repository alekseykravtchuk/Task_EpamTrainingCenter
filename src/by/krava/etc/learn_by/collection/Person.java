package by.krava.etc.learn_by.collection;

public class Persone implements Comparable<Persone> {
    private int personId;
    private String name;

    public Persone(int personId, String name) {
        this.personId = personId;
        this.name = name;
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
        return "Persone{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persone o) {
//        int result = personId - o.personId;
//        int value = 0;
//        if (result > 0) {
//            value = 1;
//        } else if (result < 0) {
//            value = -1;
//        }
        return name.compareTo(o.name);
    }
}
