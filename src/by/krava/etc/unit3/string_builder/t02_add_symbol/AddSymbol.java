package by.krava.etc.unit3.string_builder.t02_add_symbol;

/*
 *  В строке вставить после каждого символа 'a' символ 'b'
 */

public class AddSymbol {

    private static String addSymbol (String line) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                strBuilder.append("ab");
            } else {
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
        System.out.println(addSymbol(line));
    }
}
