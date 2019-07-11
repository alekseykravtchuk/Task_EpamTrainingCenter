package by.krava.etc.unit3.string_builder.t05_character_counter;

/*
 *  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
 */

public class CharacterCounter {

    private static int countCharacter(String line, char ch) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                counter++;
            }
         }
        return counter;
    }

    public static void main(String[] args) {
        String line = "If you can keep your head when all about you\n" +
                      "Are losing theirs and blaming it on you;\n" +
                      "If you can trust yourself when all men doubt you,\n" +
                      "But make allowance for their doubting too...";
        System.out.println(countCharacter(line, 'a'));
    }
}
