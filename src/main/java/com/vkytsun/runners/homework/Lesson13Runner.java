package com.vkytsun.runners.homework;

import com.vkytsun.app.homework.lesson13.Human;
import com.vkytsun.app.homework.lesson13.WhiteCollar;

import java.util.Scanner;

public class Lesson13Runner {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of the task to execute: " + "\n" +
                    "1. Create an instance of class Human." + "\n" +
                    "2. Create an instance of class WhiteCollar which extends from class Human." + "\n" +
                    "0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1: Scanner humanScanner = new Scanner(System.in);
                    System.out.println("Please, enter the age of the human.");
                    int age = humanScanner.nextInt();
                    Human human = new Human("Bob",age);
                    //human.setAge(21);
                    break;
                case 2: Scanner companyScanner = new Scanner(System.in);
                    System.out.println("Please, enter the company name.");
                    String companyName = companyScanner.nextLine();
                    WhiteCollar whiteCollar = new WhiteCollar("Roy", 25, "K2");
                    whiteCollar.setCompanyName(companyName);
                    break;
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number != 0);
    }
}
