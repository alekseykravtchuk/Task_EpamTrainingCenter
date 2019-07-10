package by.krava.etc.unit3.string_builder.t04_make_word;

/*
 * С помощью функции копирования и операции конкатенации
 * составить из частей слова “информатика” слово “торт”.
 */

public class MakeWord {

    private static String makeWord (String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }

    public static void main(String[] args) {
        String informatics = "информатика";
        System.out.println(makeWord(informatics));
    }
}
