package com.vkytsun.runners.homework;


import com.vkytsun.app.homework.lesson17.ArraySorterGenerics;
import com.vkytsun.app.homework.lesson17.ArrayStringSorter;

import java.util.Scanner;

public class Lesson17Runner {
    public static void main(String[] args) {
        System.out.println("\n\nPlease, choose one of the tasks to execute. " + "\n" +
                "Enter TASK1 - if want sort array using generics." + "\n" +
                "Enter TASK2 - if want " + "\n" +
                "Enter TASK0 - Exit.");
        try {
            Scanner scanner = new Scanner(System.in);
            String numberOfTask = scanner.nextLine();
            ItemsOfMenu itemsOfMenu = ItemsOfMenu.valueOf(numberOfTask);
            //Items.convert(numberOfTask);
            //itemsOfMenu.getValue();

            switch (itemsOfMenu) {
                case TASK1:
                    Integer[] integersArray = {81, 22, 6, 1, 3,434, -23, 0, 12};
                    Double[] doublesArray = {32.55, 12.12, 8.3, 5.6, 10.1, 4.3, 123.43};
                    //Float[] floatsArray = {1.4f, 15.2f, 41.2f, 97.3f, 12.1f};
                    ArraySorterGenerics.bubbleStaticSort(integersArray);
                    ArraySorterGenerics arraySorterGenerics = new ArraySorterGenerics(doublesArray);
                    arraySorterGenerics.getT();
                    arraySorterGenerics.sort();
                    break;
                case TASK2:
                    ArrayStringSorter.sortString();
                    break;
                case TASK0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            }
        } catch (NullPointerException e ) {
            System.out.println("Invalid number entered.");
        }
    }

}
