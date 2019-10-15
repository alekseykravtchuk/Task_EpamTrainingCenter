package by.krava.etc.unit6.t1_home_library.entity;

public class Book {
    private String author;
    private String title;
    private int year;
    private BookType type;

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public BookType getType() {
        return type;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        if (!author.equals(book.author)) return false;
        if (!title.equals(book.title)) return false;
        return type == book.type;
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + year;
        result = 31 * result + type.hashCode();
        return result;
    }
}
