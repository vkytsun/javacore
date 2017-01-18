package com.vkytsun.app.homework.lesson17;
/*Написать класс который
- считывает набор слов с клавиатуры - каждое слово разделяется новой строкой (Enter).
- Если был ввод пустой строки - программа прекращает считывание строк с клавиатуры,
- убирает дубликаты строк (если они есть) и
- сортирует список строк в алфавитном порядке, после чего
- выводит на экран список строк в столбик.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        String word;
        String wordList;
        System.out.println("Please, enter some words!");
        HashSet noDublicates = new HashSet();
        Scanner scanner = new Scanner(System.in);
        do {
            String enteredWord = scanner.nextLine();
            ArrayList<String> enteredWordList = new ArrayList<>();
            enteredWordList.add(enteredWord);
            noDublicates.add(enteredWord);
            word = enteredWord;
        } while (word.length() != 0);
        System.out.println(noDublicates);

    }
}
