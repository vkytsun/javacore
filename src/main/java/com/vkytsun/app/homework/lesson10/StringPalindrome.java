package com.vkytsun.app.homework.lesson10;

import java.util.Scanner;

public class StringPalindrome {
    public static String palindromeFirstMethod(String palindrome) {
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length()/2; i++) {
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i) == palindrome.charAt(palindrome.length()-i-1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else {
            System.out.println("Not palindrome");
        } return palindrome;
    }
    public static boolean palindromeSecondMethod(String str) {
        //compare symbols in a row on both sides to check for a palindrome
        if (str == null) {
            return false;
        }
        int length = str.length();
        System.out.println(length/2);
        for (int i = 0; i < length/2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                System.out.println("Not palindrome");
                return false;
        }
        System.out.println("Palindrome");
        return true;
    }
    public static boolean palindromeThirdMethod(String palindrome) {
        //create string and define it from the end
        for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
           if (palindrome.charAt(i) != palindrome.charAt(j)) {
               System.out.println("Not palindrome");
               return false;
        }
        System.out.println("Palindrome");
        } return true;
    }
}
