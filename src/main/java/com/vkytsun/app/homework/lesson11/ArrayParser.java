package com.vkytsun.app.homework.lesson11;

import com.vkytsun.app.homework.lesson9.ArrayPrint;
import com.vkytsun.app.homework.lesson9.SortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayParser {
    public static void calcArrayParser() {
        System.out.println("Please, enter numbers, separated by semicolons in a row.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(";");
        System.out.println("Created array by user:" + "\n" + Arrays.toString(splittedStringArray));

        int[] intArray = new int[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) {
            intArray[i] = Integer.parseInt(splittedStringArray[i]);
            //System.out.print(intArray[i] + " ");
        }
        System.out.println("\nPress 1 - if want sort array from Min to Max." + "\n" +
                "Press 2 - if want sort array from Max to Min.\n");
        Scanner scannerSort = new Scanner(System.in);
        int sort = scannerSort.nextInt();
        if (sort == 1) {
            SortingArray.bubbleSortMinToMax(intArray);
            ArrayPrint.bubbleSortMintoMaxArray(intArray);
            //Arrays.sort(splittedStringArray);
            //System.out.println("Sorted array from Min to Max:" + "\n"+ Arrays.toString(splittedStringArray));
        } else if (sort == 2) {
            SortingArray.bubbleSortMaxToMin(intArray);
            ArrayPrint.bubbleSortMaxToMinArray(intArray);
        }
    }
    public static void extractLettersArray() {
        System.out.println("Please, choose a separator:" + "\n" +
                "Press 1 if you accept to use default separator." + "\n" +
                "Press 2 if you want to change a separator.");
        Scanner scanner = new Scanner(System.in);
        String numberSeparator = scanner.nextLine();
        String separtor = "";
        if (numberSeparator.equals("1")) {
            System.out.println("Default separator is a dot - " + "\"" + "."+ "\"");
            separtor = "\\.";
        } else {
            System.out.println("Please, enter your separator.");
            separtor = scanner.nextLine();
            //Scanner  nextScanner = new Scanner(System.in);
            //String yourSepartor = nextScanner.nextLine();
            //String[] splittedInputSeparator = yourSepartor.split(separtor);
        }
        System.out.println("Please, enter symbols, separated by chosen separator.");
        Scanner scan = new Scanner(System.in);
        String inputSymbol = scan.nextLine();
        String[] splittedArray = inputSymbol.split(separtor);
        System.out.println("Created array by user:" + "\n" + Arrays.toString(splittedArray));
        System.out.println("Extracted letters from array are: ");
        for (int i = 0; i < splittedArray.length; i++) {
            if (splittedArray[i].matches("^.*[a-zA-Z].+$")) { // help!!! Як правильно вивести букви алфавіту???
                System.out.print(splittedArray[i] + " ");
            }
        }
    }
}

