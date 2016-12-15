package com.vkytsun.app.homework.lesson11;

import java.util.Scanner;

public class SplitStringByKeyword {
    public static void splitString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter string.");
        String inputString = scanner.nextLine().toLowerCase();
        System.out.println("Please, enter keyword to the string.");
        String inputKeyword = scanner.nextLine().toLowerCase();
        if (inputString.contains(inputKeyword)) {
            String[] splittedStringArray = inputString.split(inputKeyword);
            for (int i = 0; i < splittedStringArray.length; i++) {
                System.out.println(splittedStringArray[i].trim());
            }
        }
        else {
            System.out.println(inputString);
        }
    }
}
