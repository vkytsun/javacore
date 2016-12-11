package com.vkytsun.runners.homework;


import com.vkytsun.app.homework.lesson10.StringPalindrome;

import java.util.Scanner;

public class Lesson10Runner {
    public static void generatePalindromeFirstMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeFirstMethod(palindrome);
    }
    public static void generatePalindromeSecondMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeSecondMethod(palindrome);
    }
    public static void generatePalindromeThirdMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeThirdMethod(palindrome);
    }
    public static void generatePalindromeFourthMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeFourthMethod(palindrome);
    }
    public static void generatePalindromeFifthMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeFifthMethod(palindrome);
    }

    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of method to define if String is palindrome: " + "\n" +
                    "1. First method: compare symbol by symbol in a row on both sides." + "\n" +
                    "2. Second method: reverse a string and compare with the original." + "\n" +
                    "3. Third method: split the string in 2 parts and compare them (start to compare from the start and end)." + "\n" +
                    "4. Fourth method: split the string in 2 parts and compare them (start to compare from the middle)." + "\n" +
                    "5. Fifth method: reverse a string and compare with the original using StringBuilder." + "\n" +
                    "0. Exit.\n");
            Scanner scanner = new Scanner(System.in);
            int numberOfTask = scanner.nextInt();
            switch (numberOfTask) {
                case 1:
                    generatePalindromeFirstMethod();
                    break;
                case 2:
                    generatePalindromeSecondMethod();
                    break;
                case 3:
                    generatePalindromeThirdMethod();
                    break;
                case 4:
                    generatePalindromeFourthMethod();
                    break;
                case 5:
                    generatePalindromeFifthMethod();
                    break;
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number !=0);
    }
}
