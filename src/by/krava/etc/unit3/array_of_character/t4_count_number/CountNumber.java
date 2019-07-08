package by.krava.etc.unit3.array_of_character.t4_count_number;

/*
 * В строке найти количество чисел.
 */

public class CountNumber {

    private static int countNumbers (String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (isDigit(line.charAt(i))) {
                if (i == line.length() - 1 || !isDigit(line.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static boolean isDigit (char ch) {
        boolean isDigit = false;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (char element : digits) {
            if (ch == element) {
                isDigit = true;
            }
        }
        return isDigit;
    }

    public static void main(String[] args) {
        String line = "Рецепт блинов: \n" +
                "молоко - 500 мл, \n" +
                "яйца - 3 шт, \n" +
                "мука - 280 г, \n" +
                "сахар - 1-2 столовые ложки, \n" +
                "соль - 1 чайная ложка (без горки) , \n" +
                "растительное масло - 3 столовые ложки \n" +
                "test 2";
        System.out.println(countNumbers(line));
    }
}
