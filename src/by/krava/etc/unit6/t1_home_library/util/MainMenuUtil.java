package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.*;

import java.util.Iterator;
import java.util.List;

public class MainMenuUtil {
    private static Catalog catalog = null;
    public static void start() {
        System.out.println("Welcome to the library!");
        if(entrance()) {
            System.out.println("Login successful.");
        }
        while (true) {
            UserLevel userLevel = catalog.getUser().getUserLevel();
            System.out.println(getMainOptions(userLevel));
            int option = InputUtil.checkInputChoice(userLevel);
            if (option != 0) {
                performOperation(option);
            } else {
                System.out.println("Goodbye. Waiting for you again.");
                break;
            }
        }
    }

    private static boolean entrance() {
        User user = null;
        while (user == null) {
            System.out.print("Enter login: ");
            String username = InputUtil.checkInputLine();
            System.out.print("Enter password: ");
            String password = InputUtil.checkInputLine();
            user = UserUtils.login(username, password);
            if(user == null) {
                System.out.println("Wrong login or password. Try again.");
            }
        }
        List<Book> books = FileHandler.loadBooks();
        catalog =  new Catalog(user, books);
        return true;
    }

    private static String getMainOptions(UserLevel userLevel) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nAvailable options:\n").append("1. View books in the catalog.\n");
        sb.append("2. Find a book in the catalog.\n");
        if(userLevel == UserLevel.ADMIN) {
            sb.append("3. Add a book to the catalog.\n");
            sb.append("4. Remove book from catalog.\n");
            sb.append("5. Register a new user.\n");
            sb.append("6. Delete user.\n");
        } else {
            sb.append("3. Suggest an administrator to add a book.\n");
        }
        sb.append("9. Change user\n");
        sb.append("0. To finish work.\n");
        return sb.toString();
    }

    private static void performOperation(int option) {
        switch (option) {
            case 1:
                if (!CatalogUtil.printBooks(catalog.getBooks())){
                        System.out.println("The catalog is empty.\n");
                }
                break;
            case 2:
                while (!CatalogUtil.findBook(catalog)) {
                    System.out.println("Error in request, try again.");
                }
                break;
            case 3:
                Book book = CatalogUtil.createBook();
                if (catalog.getUser().getUserLevel() == UserLevel.ADMIN) {
                    if (CatalogUtil.addBook(catalog, book)) {
                        System.out.println("Book successfully added.");
                    } else {
                        System.out.println("The book is already in the catalog.\n");
                    }
                } else {
                    if (CatalogUtil.suggestBook(catalog, book)) {
                        System.out.println("The book was sent to the administrator by e-mail.");
                    } else {
                        System.out.println("The book is already in the catalog.\n");
                    }
                }
                break;
            case 4:
                Book removeBook = CatalogUtil.createBook();
                if (CatalogUtil.removeBook(catalog, removeBook)) {
                    System.out.println("Book successfully deleted from catalog.");
                } else {
                    System.out.println("The catalog doesn't contain this book!");
                }
                break;
            case 5:
                if(UserUtils.addUser()) {
                    System.out.println("New user added successfully.");
                }
                break;
            case 6:
                if (UserUtils.removeUser()) {
                    System.out.println("User successfully deleted.");
                }
                break;
            case 9:
                if(entrance()) {
                    System.out.println("Good day, " + catalog.getUser().getUsername() + "!");
                }

        }
    }
}
