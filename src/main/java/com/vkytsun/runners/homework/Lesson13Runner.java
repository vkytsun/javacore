package com.vkytsun.runners.homework;

import com.vkytsun.app.homework.lesson13.EnumLesson13;
import com.vkytsun.app.homework.lesson13.Human;
import com.vkytsun.app.homework.lesson13.WhiteCollar;

import java.util.Scanner;

public class Lesson13Runner {
    public static void main(String[] args) {
        System.out.println("\n\nPlease, enter the number of the task to execute. Only words, not digits! " + "\n" +
                "ONE - Create an instance of class Human." + "\n" +
                "TWO -  Create an instance of class WhiteCollar which extends from class Human." + "\n" +
                "ZERO - Exit.");
        try {
            Scanner scanner = new Scanner(System.in);
            String numberOfTask = scanner.nextLine();
            EnumLesson13 enumLesson13 = EnumLesson13.valueOf(numberOfTask);
            switch (enumLesson13) {
                case ONE:
                    Scanner humanScanner = new Scanner(System.in);
                    System.out.println("Please, enter the age of the human.");
                    int age = humanScanner.nextInt();
                    Human human = new Human("Bob",age);
                    break;
                case TWO:
                    Scanner companyScanner = new Scanner(System.in);
                    System.out.println("Please, enter the company name.");
                    String companyName = companyScanner.nextLine();
                    WhiteCollar whiteCollar = new WhiteCollar("Roy", 25, "K2");
                    whiteCollar.setCompanyName(companyName);
                    break;
                case ZERO:
                    break;
            }
        } catch (IllegalArgumentException e ) {
            System.out.println("Invalid number entered.");
        }
    }

}
