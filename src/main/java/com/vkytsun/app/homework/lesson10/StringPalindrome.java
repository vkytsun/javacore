package com.vkytsun.app.homework.lesson10;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.List;
import java.util.Scanner;

public class StringPalindrome {
    public static String palindromeFirstMethod(String palindrome) {
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else {
            System.out.println("Not palindrome");
        }
        return palindrome;
    }

    public static boolean palindromeSecondMethod(String str) {
        //compare symbols in a row on both sides to check for a palindrome
        if (str == null) {
            return false;
        }
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {
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
        }
        return true;
    }


   /** public static boolean palindromeFourthMethod(String str) {
        //System.out.println(str.charAt(0));
        String reverse = "";
        int length = str.length();
        for (int i = 0; i < length - 1 ; i++) {
            reverse.charAt(i) = str.charAt(length - i - 1);
        }

        // here


    }

        /**String reverse = original.length();
        int length = original.length();
        for (int i = length - 1; i > 0; i--) {
            reverse += original.charAt(i);
            if (original.equals(reverse)) {
                System.out.println("Entered string is a palindrome.");
                return true;
            } else {
                System.out.println("Entered string is not palindrome");
                return false;
            }
        }*/



   /** public static boolean palindromeFifthhMethod(String str) {
        //palindrome program in java using for loop
        String revstring = "";
        for (int i = str.length() - 1; i > 0; i--) {
            revstring += str.charAt(i);
            //System.out.println("Revstring");
        }
        if (revstring.equalsIgnoreCase(str)) {
            System.out.println("The string is Palindrome");
        } else   {
            System.out.println("Not Palindrome");
            return false;
        } return true;
    }*/
//}

