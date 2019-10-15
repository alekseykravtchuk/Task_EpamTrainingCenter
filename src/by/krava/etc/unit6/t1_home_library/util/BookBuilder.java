package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.Book;
import by.krava.etc.unit6.t1_home_library.entity.BookType;

public class BookBuilder {
    private Book book;

    public BookBuilder() {
        this.book = new Book();
    }

    public BookBuilder setAuthor(String author) {
        book.setAuthor(author);
        return this;
    }

    public BookBuilder setTitle(String title) {
        book.setTitle(title);
        return this;
    }

    public BookBuilder setYear(int year) {
        book.setYear(year);
        return this;
    }

    public BookBuilder setType(BookType type) {
        book.setType(type);
        return this;
    }

    public Book build() {
        return book;
    }
}
