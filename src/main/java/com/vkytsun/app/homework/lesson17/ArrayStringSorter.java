package com.vkytsun.app.homework.lesson17;
/*Написать класс который
- считывает набор слов с клавиатуры - каждое слово разделяется новой строкой (Enter).
- Если был ввод пустой строки - программа прекращает считывание строк с клавиатуры,
- убирает дубликаты строк (если они есть) и
- сортирует список строк в алфавитном порядке, после чего
- выводит на экран список строк в столбик.*/

import java.util.*;

public class ArrayStringSorter {
    public static String sortString() {
        String word;
        System.out.println("Please, enter some words!");
        //HashSet noDublicates = new HashSet();
        TreeSet<String> enteredWordList = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            String enteredWord = scanner.nextLine();
            //noDublicates.add(enteredWord);
            enteredWordList.add(enteredWord);
            word = enteredWord;
        } while (!word.isEmpty());
        /*TreeSet<String> enteredWordList = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });*/
        System.out.println("The list of strings are:");
        //enteredWordList.addAll(noDublicates);
        for (Object wordlist : enteredWordList) {
            System.out.println(wordlist);
        }
        return word;
    }
}
