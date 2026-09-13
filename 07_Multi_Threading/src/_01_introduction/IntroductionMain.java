package _01_introduction;

import java.util.Scanner;

public class IntroductionMain {
    public static void main(String[] args){

        // WITHOUT MULTITHREADING
//        Introduction_01 intro = new Introduction_01();

        // 1. first activity is adding two numbers
//        intro.add();

        // 2. character printing activity
//        intro.printCharacters();

        // 3. number printing activity
//        intro.printNumbers();

        // WITH MULTITHREADING
        Addition addition = new Addition();
        PrintCharacters printCharacters = new PrintCharacters();
        PrintNumbers printNumbers = new PrintNumbers();

//        addition.run();
//        printCharacters.run();
//        printNumbers.run();

        addition.start();
        printCharacters.start();
        printNumbers.start();
    }
}
