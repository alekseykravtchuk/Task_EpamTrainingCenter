package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.*;

import java.util.List;

public class MainMenuUtil {
    private static Catalog catalog = null;
    public static void start() {
        System.out.println("Welcome to the library!");
        catalog = entrance();
        while (true) {
            UserLevel userLevel = catalog.getUser().getUserLevel();
            System.out.println(getMainOptions(userLevel));
            int option = InputUtil.checkInputChoice(userLevel);
            if (option != 0) {
                performOperation(catalog, option);
            } else {
                System.out.println("Goodbye. Waiting for you again.");
                break;
            }
        }
    }

    private static Catalog entrance() {
        User user = null;
        while (user == null) {
            System.out.print("Enter login: ");
            String username = InputUtil.checkInputLine();
            System.out.print("Enter password: ");
            String password = InputUtil.checkInputLine();
            System.out.println();
            user = UserUtils.login(username, password);
            if(user == null) {
                System.out.println("Wrong login or password. Try again.");
            }
        }
        List<Book> books = FileHandler.loadBooks();
        return new Catalog(user, books);
    }

    private static String getMainOptions(UserLevel userLevel) {
        StringBuilder sb = new StringBuilder();
        sb.append("Available options:\n").append("1. View books in the catalog.\n");
        sb.append("2. Search for a book in the catalog.\n");
        if(userLevel == UserLevel.ADMIN) {
            sb.append("3. Add a book to the catalog.\n");
            sb.append("4. Delete a book in the catalog.\n");
            sb.append("5. Register a new user.\n");
            sb.append("6. Delete user.\n");
        }
        sb.append("9. Change user\n");
        sb.append("0. To finish work.\n");
        return sb.toString();
    }

    private static void performOperation(Catalog catalog, int option) {
        switch (option) {
            case 1:
                if(!CatalogUtil.printBooks(catalog)){
                        System.out.println("The catalog is empty.\n");
                }
                break;
            case 2:
                break;
            case 3:
                Book book = createBook();
                if(CatalogUtil.addBook(catalog, book)) {
                    System.out.println("Book successfully added.");
                } else { System.out.println("Error adding book.\n"); }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 9:
                if(changeUser()) {
                    System.out.println("Good day, " + catalog.getUser().getUsername() + "!");
                }

        }
    }

    private static Book createBook() {
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

    private static boolean changeUser() {
        System.out.print("Enter login: ");
        String username = InputUtil.checkInputLine();
        System.out.print("Enter password: ");
        String password = InputUtil.checkInputLine();
        MainMenuUtil.catalog.setUser(UserUtils.login(username, password));
        return true;
    }
}
