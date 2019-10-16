package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.BookType;
import by.krava.etc.unit6.t1_home_library.entity.UserLevel;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String checkInputLine() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{4,30}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Make sure the line is between 4 and 30 characters long.");
        }
        return scanner.nextLine();
    }

    public static int checkInputChoice(UserLevel userLevel) {
        Pattern pattern;
        if(userLevel == UserLevel.ADMIN) {
            pattern = Pattern.compile("[0-6[9]]");
        } else {
            pattern = Pattern.compile("[0-3[9]]");
        }
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Not available operation. Try again.");
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static int checkInputYear() {
        Pattern pattern = Pattern.compile("[\\d ]{4}");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("The year should be four digits.");
        }
        return scanner.nextInt();
    }

    public static BookType checkInputBookType() {
        Pattern pattern = Pattern.compile("[1-2]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Try again.");
        }
        if (scanner.nextInt() == 1) {
            return BookType.EBOOK;
        } else return BookType.PAPER;
    }
}
