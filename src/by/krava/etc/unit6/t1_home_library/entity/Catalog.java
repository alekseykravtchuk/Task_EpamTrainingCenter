package by.krava.etc.unit6.t1_home_library.entity;

import java.util.List;

public class Catalog {
    private User user;
    private List<Book> books;

    public Catalog(User user, List<Book> books) {
        this.user = user;
        this.books = books;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
