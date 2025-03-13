package com.company;

public class MainNewApproach {

    private final String word;                      // загаданное слово
    private final StringBuilder displayWord;        // Отображаемое слово (например, "_ _ _ _")
    private int attemptsLeft = 6;                   // Количество оставшихся попыток

    public MainNewApproach(String wordArg) {
        /*
        this.word = word;  // (5) Сохраняем переданное слово
        this.displayWord = new StringBuilder("_".repeat(word.length()));
        (6) Создаем строку из символов "_" той же длины, что и слово
         */

        word = wordArg;                         // присваиваем загаданное слово.
        int wordLength = word.length();         // возвращает кол-во символов в строке и передаём эту инфу в переменную типа инт
        String mask = "_ ";                      // переменная типа стринг
        String str2 = mask.repeat(wordLength);  // делаем действие надо объектом типа Стринг - вызываем метод Репит // Заполняем слово подчеркиваниями
        displayWord = new StringBuilder(str2); // Заполняем слово подчеркиваниями "_ _ _ _ _"
        System.out.println(displayWord.toString());
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
