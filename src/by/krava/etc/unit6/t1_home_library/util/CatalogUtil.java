package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.*;

import java.util.List;
import java.util.stream.Collectors;

public class CatalogUtil {

    public static boolean printBooks(List<Book> books) {
        if(books.size() != 0) {
            int page = 1;
            int booksOnPage = 5;
            int numberOfPages = books.size() / booksOnPage + 1;
            while (page > 0 && page <= numberOfPages) {
                System.out.println("Page " + page + " of " + numberOfPages + ":");
                int i = page * booksOnPage - booksOnPage;
                for (; i < page * booksOnPage && i < books.size(); i++) {
                    System.out.print(i + 1 + " ");
                    System.out.println(getBookLine(books.get(i)));
                }
                System.out.print("Enter page number or 0 to exit: ");
                page = InputUtil.checkPageNumber();
            }
            return true;
        }
        return false;
    }

    public static boolean addBook(Catalog catalog, Book book) {
        if (!catalog.getBooks().contains(book)) {
            catalog.getBooks().add(book);
            FileHandler.saveCatalog(catalog.getBooks());
            for (User user : UserUtils.getUsers()) {
                if (!user.getUserLevel().getName().equals("admin")) {
                    Letter letter = new Letter(user.getEmail(), UserUtils.getAdmin().getEmail(), book);
                    letter.sendLetter();
                    System.out.println("Letter sent to " + user.getUsername());
                }
            }
                return true;
        }
        return false;
    }

    public static boolean suggestBook(Catalog catalog, Book book) {
        if (!catalog.getBooks().contains(book)) {
            Letter letter = new Letter(UserUtils.getAdmin().getEmail(), catalog.getUser().getEmail(), book);
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

    public static Book createBook() {
        BookBuilder bookBuilder = new BookBuilder();
        System.out.print("Enter the name of the author: ");
        bookBuilder.setAuthor(InputUtil.checkInputLine());
        System.out.print("Enter a title for the book: ");
        bookBuilder.setTitle(InputUtil.checkInputLine());
        System.out.print("Enter the year the book was published: ");
        bookBuilder.setYear(InputUtil.checkInputYear());
        System.out.print("Enter the type number of the book: 1 - e-book, 2 - paper book:");
        bookBuilder.setType(InputUtil.checkInputBookType());
        return bookBuilder.build();
    }

    public static boolean findBook(Catalog catalog) {
        List<Book> books = null;
        System.out.print("Enter \"1\" to search by author or \"2\" to search by name: ");
        int request = InputUtil.checkInputChoice(UserLevel.USER);
        if (request == 1) {
            System.out.print("Enter author name: ");
            String author = InputUtil.checkInputLine();
            books = CatalogUtil.findBookByAuthor(catalog.getBooks(), author);
        } else if (request == 2) {
            System.out.print("Enter book title: ");
            String title = InputUtil.checkInputLine();
            books = CatalogUtil.findBookByTitle(catalog.getBooks(), title);
        } else { return false;}
        if(books.size() != 0) {
            CatalogUtil.printBooks(books);
        } else {
            System.out.println("Book not found. Perhaps the request is incorrect.");
        }
        return true;
    }

    public static List<Book> findBookByAuthor(List<Book> books, String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    public static List<Book> findBookByTitle(List<Book> books, String title) {
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }
}
