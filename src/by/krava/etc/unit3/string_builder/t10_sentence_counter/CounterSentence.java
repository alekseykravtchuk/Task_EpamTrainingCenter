package by.krava.etc.unit3.string_builder.t10_sentence_counter;

public class CounterSentence {

    private static int countSentences (String line) {
        int counter = 1;
        char [] marks = {'.', '!', '?'};
        for (int i = 0; i < line.length() - 1; i++) {
            char character = line.charAt(i);
            for (char mark : marks) {
                if (character == mark && (line.charAt(i + 1) == ' ' || line.charAt(i + 1) == 10)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String lineX = "Shall I compare thee to a summer’s day?\n" +
                      "Thou art more lovely and more temperate.\n" +
                      "Rough winds do shake the darling buds of May,\n" +
                      "And summer’s lease hath all too short a date!\n" +
                      "Sometime too hot the eye of heaven shines,\n" +
                      "And often is his gold complexion dimm’d.";

        System.out.println("Number of sentences per line: " + countSentences(lineX));
    }
}
