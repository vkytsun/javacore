package com.vkytsun.runners.homework;


import com.vkytsun.app.homework.lesson11.ArrayParser;
import com.vkytsun.app.homework.lesson11.Enigma;
import com.vkytsun.app.homework.lesson11.SplitStringByKeyword;

import java.util.Scanner;

public class Lesson11Runner {
   public static void generateString(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please, enter string");
       String inputString = scanner.nextLine();
       Enigma.stringEncode(inputString);
   }

    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Sorting array by user which was created by entering numbers separated semicolons in a row." + "\n" +
                    "2. Extract only letters from array created by user." + "\n" +
                    "3. Split input string by a keyword." + "\n" +
                    "4. Encrypting algorithm Enigma by methods cipher, encode and decode." + "\n" +
                    "0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    ArrayParser.calcArrayParser();
                    //generateArrayParser();
                    break;
                case 2:
                    ArrayParser.extractLettersArray();
                    break;
                case 3:
                    SplitStringByKeyword.splitString();
                    break;
                case 4:
                    generateString();
                    break;
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number != 0);
    }
}
