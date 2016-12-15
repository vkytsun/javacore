package com.vkytsun.runners.homework;

import java.util.Scanner;

public class Lesson12Runner {


    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Reading of the file with arrays of numbers, separated by commas, sort them and writing to another file" + "\n" +
                    "0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    break;
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        }while (number != 0);
    }
}
