package by.krava.etc.unit3.array_of_character.t3_count_digit;

/*
 * В строке найти количество цифр
 */

public class CountDigit {

    private static int countDigits(String line) {
        int counter = 0;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < line.length(); i++) {
            for (char element : digits) {
                if (line.charAt(i) == element) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String line = "Рецепт блинов: \n" +
                      "молоко - 500 мл, \n" +
                      "яйца - 3 шт, \n" +
                      "мука - 280 г, \n" +
                      "сахар - 1-2 столовые ложки, \n" +
                      "соль - 1 чайная ложка (без горки) , \n" +
                      "растительное масло - 3 столовые ложки";
        System.out.println(countDigits(line));
    }
}
