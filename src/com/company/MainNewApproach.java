package com.company;

public class MainNewApproach {

    private String word;                    // загаданное слово
    private StringBuilder displayWord;      // Отображаемое слово (например, "_ _ _ _")

    public MainNewApproach(){};

    public MainNewApproach(String wordArg) {
        word = wordArg;                     //
        int wordLength = word.length();     // возвращает кол-во символов в строке
        String mask = "_";                   // переменная типа стринг
        String str2 = mask.repeat(wordLength);// делаем действие надо объектом типа Стринг - вызываем метод Репит
        displayWord = new StringBuilder(str2); //
    }

    @Override
    public String toString() {
        return "MainNewApproach{" +
                "word='" + word + '\'' +
                ", displayWord=" + displayWord +
                '}';
    }

    public String getWord() {
        return word;
    }

    public StringBuilder getDisplayWord() {
        return displayWord;
    }
}
