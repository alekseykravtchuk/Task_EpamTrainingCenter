package by.krava.etc.unit3.array_of_character.t5_remove_extra_space;

/*
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
 * заменить на одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class ExtraSpace {

    private static String removeExtraSpaces(String s) {
        StringBuilder strBuilder = new StringBuilder();
        String line = s.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String shakespeareLine = " You shall find of the king a  husband, madam; you,\n" +
                                 "sir, a father: he that so  generally is at all  times\n" +
                                 "good  must   of necessity hold his virtue to you;  whose\n" +
                                 "worthiness would  stir it up where it wanted rather\n" +
                                 "than lack it where there is such abundance.   ";

        System.out.println(removeExtraSpaces(shakespeareLine));
    }
}
