package by.krava.etc.unit6.t1_home_library.entity;

public enum BookType {
    PAPER("Paper book"), EBOOK("eBook");
    String name;
    BookType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
