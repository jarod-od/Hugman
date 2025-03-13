package com.company;

import java.util.Scanner; // Импортируем класс Scanner для ввода с клавиатуры

// Главный класс, который запускает игру
public class AnotherClassMain {// (1) Класс с методом main

    public static void main(String[] args) {  // (2) Точка входа в программу

        Scanner scanner = new Scanner(System.in);
        MainNewApproach hangman = new MainNewApproach("hello"); // (3) Создаем экземпляр игры с загаданным словом "hello"

         System.out.println(hangman.getDisplayWord().toString());
           /* game.guessLetter('l');  // (4) Игрок вводит букву 'l', ожидаем "_ l l _ _"
            game.guessLetter('e');  // (5) Игрок вводит букву 'e', ожидаем "e l l _ _"*/




        scanner.close(); // Закрываем Scanner после завершения игры

       // String test = Main.letterValidateSecondIteration("Garry","r");
        // System.out.println(test);
        Main testNew = new Main();
        String test2 = testNew.letterValidateSecondIteration("Garry","r");
        System.out.println(test2);
    }
}
