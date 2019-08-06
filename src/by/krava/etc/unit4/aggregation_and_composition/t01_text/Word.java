package by.krava.etc.unit4.aggregation_and_composition.t01_text;

class Word {
    private String word;

    Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
