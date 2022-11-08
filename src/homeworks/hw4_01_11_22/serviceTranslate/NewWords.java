package homeworks.hw4_01_11_22.serviceTranslate;

public class NewWords {
    private String word;
    private String translateWord;

    public NewWords(String word, String translateWord) {
        this.word = word;
        this.translateWord = translateWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslateWord() {
        return translateWord;
    }

    public void setTranslateWord(String translateWord) {
        this.translateWord = translateWord;
    }
}
