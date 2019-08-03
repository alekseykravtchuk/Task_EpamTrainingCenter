package by.krava.etc.unit4.simple_object.t09_book;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *    Найти и вывести:
 *    a) список книг заданного автора;
 *    b) список книг, выпущенных заданным издательством;
 *    c) список книг, выпущенных после заданного года.
 */

public class Book {
    private static int startId = 0;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private float price;
    private String bindingType;

    Book(String title, String author, String publisher, int yearOfPublishing, int numberOfPages, float price, String bindingType) {
        this.id = ++startId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return String.format("%03d \"%s\", %s, %s, %d year, %d pages, $%.2f, binding: %s.",
                             id, title, author, publisher, yearOfPublishing, numberOfPages,
                             price, bindingType);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}
