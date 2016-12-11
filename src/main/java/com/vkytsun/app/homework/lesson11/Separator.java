package com.vkytsun.app.homework.lesson11;

import java.util.Scanner;


public class Separator {
    public static void chooseSeparator() {
        System.out.println("Please, enter numbers, separated by semicolons in a row:" + "\n" +
                "Press 1 if you accept to use default separator." + "\n" +
                "Press 2 if you want to change a separator.");
        Scanner scanner = new Scanner(System.in);
        String numberSeparator = scanner.nextLine();
        String separtor = "";
        if (numberSeparator.equals("1")) {
            separtor = ";";
        } else {
            System.out.println("Please, enter your separator.");
            separtor = scanner.nextLine();
        }
        Scanner  nextScanner = new Scanner(System.in);
        String yourSepartor = nextScanner.nextLine();
        String[] splittedInputSeparator = yourSepartor.split(separtor);
        for (int i = 0; i < splittedInputSeparator.length; i++) {
            //if (splittedInputSeparator)
                // як треба прописати(яка команда) щоб можна було вибрати інший розділювач
        }
    }
}
