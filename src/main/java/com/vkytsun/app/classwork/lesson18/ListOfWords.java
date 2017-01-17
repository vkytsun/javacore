package com.vkytsun.app.classwork.lesson18;

import java.util.*;

public class ListOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the words!");
        HashSet hs = new HashSet();
        Map map  = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            String entredWord = scanner.nextLine();

            ArrayList<String> wordList = new ArrayList<String>();

            wordList.add(entredWord);
            for (String list: wordList) {
                System.out.println(list);
            }
            //wordList.stream().forEach(System.out::println); //same as previous for each

            hs.add(entredWord);
            //System.out.println(hs);
        }
        map.put("ALL", hs);
        map.get("ALL");
       System.out.println(map.get("ALL"));
    }
}
