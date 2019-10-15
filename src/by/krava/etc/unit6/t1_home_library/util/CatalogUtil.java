package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.Book;
import by.krava.etc.unit6.t1_home_library.entity.Catalog;

public class CatalogUtil {

    public static  boolean printBooks(Catalog catalog) {
        if(catalog.getBooks().size() != 0) {
            for (Book book : catalog.getBooks()) {
                System.out.println(getBookLine(book));
            }
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

    public static String getBookLine(Book book) {
        return String.format("%s, \"%s\", %d year, type: %s",
                    book.getAuthor(), book.getTitle(),
                    book.getYear(), book.getType().getName());
    }
}
