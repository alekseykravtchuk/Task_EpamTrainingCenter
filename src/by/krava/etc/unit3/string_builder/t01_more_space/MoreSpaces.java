package by.krava.etc.unit3.string_builder.t01_more_space;

/*
 *  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class MoreSpaces {

    private static int findMoreSpaces(String line) {
        int counter = 0;
        int maxCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String line = "Shall  I   compare thee to a summer’s    day?\n" +
                      "Thou   art more lovely and   more  temperate:\n" +
                      "Rough winds do shake the darling buds of May,\n" +
                      "And summer’s lease hath all too short a date:\n" +
                      "Sometime  too  hot  the eye of heaven shines,\n" +
                      "And  often  is     his  gold complexion dimm’d.";
        int moreSpaces = findMoreSpaces(line);
        System.out.println(moreSpaces);
    }
}
