package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.Book;
import by.krava.etc.unit6.t1_home_library.entity.Catalog;
import by.krava.etc.unit6.t1_home_library.entity.Letter;

import java.util.List;
import java.util.stream.Collectors;

public class CatalogUtil {

    public static  boolean printBooks(List<Book> books) {
        if(books.size() != 0) {
            for (Book book : books) {
                System.out.println(getBookLine(book));
            }
            System.out.println();
            return true;
        }
        return false;
    }

    public static boolean addBook(Catalog catalog, Book book) {
        if (!catalog.getBooks().contains(book)) {
            catalog.getBooks().add(book);
            FileHandler.saveCatalog(catalog.getBooks());
            return true;
        }
        return false;
    }

    public static boolean suggestBook(Catalog catalog, Book book) {
        if (!catalog.getBooks().contains(book)) {
            Letter letter = new Letter(UserUtils.getAdminEmail(), catalog.getUser().getEmail(), book);
            if (letter.sendLetter()) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeBook(Catalog catalog, Book book) {
        if (catalog.getBooks().remove(book)) {
            FileHandler.saveCatalog(catalog.getBooks());
            return true;
        } else {
            return false;
        }
    }

    public static String getBookLine(Book book) {
        return String.format("%s, \"%s\", %d year, type: %s",
                    book.getAuthor(), book.getTitle(),
                    book.getYear(), book.getType().getName());
    }

    public static List<Book> findBookByAuthor(List<Book> books, String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    public static List<Book> findBookByTitle(List<Book> books, String title) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }
}
