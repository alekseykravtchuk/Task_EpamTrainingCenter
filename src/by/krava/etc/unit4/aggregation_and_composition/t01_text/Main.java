package by.krava.etc.unit4.aggregation_and_composition.t01_text;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {

    public static void main(String[] args) {
        Word heading = new Word("State Lines");
        String line1 = "When I drink coffee in the morning and scroll through the" +
                    " twitter feeds of my poet friends, I see material that Marx would" +
                    " appreciate, from memes about the redistribution of wealth to" +
                    " literature about the Democratic Socialists of America.\n";
        Sentence sentence = new Sentence(line1);
        Text poem = new Text(heading, sentence);

        String line2 = "The oppression of modern economic life is partly what drives my " +
                    "friends toward these concepts; the racism, sexism, and bigotry that" +
                    " are uniquely enabled by economic inequality are also responsible.\n";
        String line3 = "Many of my friends believe that climate change will require strong" +
                    " government management of industry and enterprise. Some, I think, see" +
                    " socialism as a tool to break down the ideologies of injustice that " +
                    "helped elect Donald Trump.\n";
        poem.addSentence(new Sentence(line2));
        poem.addSentence(new Sentence(line3));

        poem.printText();
        poem.printHeading();
    }
}
