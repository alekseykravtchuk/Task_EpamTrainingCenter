package by.krava.etc.learn_by.jdbc;

public class Abonent {
    private int id;
    private String name;
    private int phone;

    public Abonent(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonent{");
        sb.append("id=").append(id);
        sb.append(", name= ").append(name).append('\'');
        sb.append(", phone=").append(phone);
        sb.append('}');

        return sb.toString();
    }
}
