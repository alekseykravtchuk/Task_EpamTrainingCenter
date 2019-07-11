package by.krava.etc.unit3.string_builder.t07_remove_replay;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef"
 */

public class RemoveReplays {

    private static String removeReplays (String line) {
        StringBuilder strBuilder = new StringBuilder(line);
        for (int i = 0; i < strBuilder.length(); i++) {
            char ch = strBuilder.charAt(i);

            /* удаляем пробелы */
            if (ch == ' ') {
                strBuilder.deleteCharAt(i);
                i--;
                continue;
            }

            /* удаляем повторяющиеся символы */
            for (int j = i + 1; j < strBuilder.length(); j++) {
                if(strBuilder.charAt(j) == ch) {
                    strBuilder.deleteCharAt(j);
                }
            }
        }
        return  strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "Вводится строка. Требуется удалить из нее повторяющиеся символы " +
                      "и все пробелы. Например, если было введено \"abc cde def\", то " +
                      "должно быть выведено \"abcdef\"";
        System.out.println(removeReplays(line));
    }
}
