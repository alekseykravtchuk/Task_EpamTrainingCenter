package by.krava.etc.unit3.string_builder.t06_repeat_character;

/*
 * Из заданной строки получить новую, повторив каждый символ дважды
 */

public class RepeatCharacter {
    private static String repeatCharacter (String line, int factor) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < factor; j++) {
                strBuilder.append(line.charAt(i));
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "If you can keep your head when all about you\n" +
                "Are losing theirs and blaming it on you;\n" +
                "If you can trust yourself when all men doubt you,\n" +
                "But make allowance for their doubting too...";
        System.out.println(repeatCharacter(line, 2));
    }
}
