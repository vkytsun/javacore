package com.vkytsun.runners.homework;


import com.vkytsun.app.homework.lesson10.StringPalindrome;

import java.util.Scanner;

public class Lesson10Runner {
    public static void generatePalindromeFirstMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string to check if it is a palindrome");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeFirstMethod(palindrome);
    }
    public static void generatePalindromeSecondMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string to check if it is a palindrome");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeSecondMethod(palindrome);
    }
    public static void generatePalindromeThirdMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string to check if it is a palindrome");
        String palindrome = scanner.nextLine();
        StringPalindrome.palindromeThirdMethod(palindrome);
    }
    public static void generatePalindromeFourthMethod() {
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string to check if it is a palindrome");
        original = scanner.nextLine();
        StringPalindrome.palindromeFourthMethod(original,reverse);
    }

    public static void main(String[] args) {
        int number;
        do {
            System.out.println("\n\nPlease, enter the number of method to define if String is palindrome: " + "\n" +
                    "1. First Method." + "\n" +
                    "2. Second Method." + "\n" +
                    "3. Third Method." + "\n" +
                    "4. Fourth Method." + "\n" +
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
                case 0: break;
                default:
                    System.out.println("You have made incorrect choice.");
            } number = numberOfTask;
        } while (number !=0);
    }
}
