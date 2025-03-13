package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(AsciiPart.GAME_TITLE);
        System.out.println(AsciiPart.GAME_START);
        System.out.println(AsciiPart.EMPTY_GALLOW);

        String wordImagine = "badminton";
        char[] wordPartsOutside = {'b'};
        String letter = "bma";

        Main.letterValidate(wordImagine, wordPartsOutside);
        System.out.println("");
        //Main.letterValidateSecondIteration(wordImagine, letter);

        String result = letterValidateSecondIteration(wordImagine, letter);
        System.out.println(result);

        Scanner s = new Scanner(System.in);
        System.out.println("write your letter");
        System.out.print("> ");
        String antlr = s.nextLine();
        System.out.println(antlr);


    }

    public static String letterValidateSecondIteration(String imagineWord, String tryHard) {

        //String regex = "[^" + tryHard + "]";
        // write your code here

        String regexp = String.format("[^%s]", tryHard);
        System.out.println(regexp);
        System.out.printf("%d%n", 255);

        //return(imagineWord.replaceAll(regex, "_"));
        return imagineWord.replaceAll(regexp, "_");


    }


    public static void letterValidate(String word, char[] wordParts) {

        // System.out.println(word);
        // System.out.println(wordParts);

        for (int i = 0; i < word.length(); i++) {
            char temp = '_';
            char letterI = word.charAt(i); // текущая буква из загаданного слова

            for(int k = 0; k < wordParts.length; k++) {
                if (wordParts[k] == letterI ){      // итая буква в загаданном слове с катой буквой из попытки, т.к. выбранной буквой.
                    temp = letterI;
                    //System.out.println(word.charAt(i));
                     break;
                }
            }
            System.out.print(temp);
           // System.out.println(word.charAt(i));
        }
    }
}
