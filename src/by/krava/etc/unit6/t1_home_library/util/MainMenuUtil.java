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
                while (!findBook()) {
                    System.out.println("Error in request, try again.");
                }
                break;
            case 3:
                Book book = createBook();
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
                Book removeBook = createBook();
                if (CatalogUtil.removeBook(catalog, removeBook)) {
                    System.out.println("Book successfully deleted from catalog.");
                } else {
                    System.out.println("The catalog doesn't contain this book!");
                }
                break;
            case 5:
                if(addUser()) {
                    System.out.println("New user added successfully.");
                }
                break;
            case 6:
                if (removeUser()) {
                    System.out.println("User successfully deleted.");
                }
                break;
            case 9:
                if(entrance()) {
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

    private static boolean addUser() {
        System.out.print("Enter login: ");
        String login = InputUtil.checkInputLine();
        List<User> users = UserUtils.getUsers();
        if (UserUtils.isUserExist(login)) {
            System.out.println("The user with \"" + login + "\" is exist!");
            return false;
        }
        System.out.print("Enter password: ");
        String password = InputUtil.checkInputLine();
        String encryptedPassword = PasswordUtils.md5Custom(password);
        System.out.println("Enter name: ");
        String name = InputUtil.checkInputLine();
        User user = new UserBuilder(login, encryptedPassword).setName(name).setUserLevel(UserLevel.USER).build();
        users.add(user);
        FileHandler.saveUserList(users);
        return true;
    }

    private static boolean removeUser() {
        System.out.print("Enter login: ");
        String login = InputUtil.checkInputLine();
        List<User> users = UserUtils.getUsers();
        if (!UserUtils.isUserExist(login)) {
            System.out.println("The user with \"" + login + "\" does not exist!");
            return false;
        }
        System.out.print("Enter password: ");
        String password = InputUtil.checkInputLine();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (login.equalsIgnoreCase(user.getLogin())){
                String encryptedPassword = PasswordUtils.md5Custom(password);
                if (encryptedPassword.equalsIgnoreCase(user.getPassword())){
                    iterator.remove();
                }
            }
        }
        FileHandler.saveUserList(users);
        return true;
    }

    private static boolean findBook() {
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
}
