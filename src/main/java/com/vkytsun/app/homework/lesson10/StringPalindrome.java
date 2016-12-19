package com.vkytsun.app.homework.lesson10;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean palindromeFirstMethod(String palindrome) {
        //compare symbols in a row on both sides to check for a palindrome
        boolean isPalindrome = true;
        palindrome = palindrome.toLowerCase();
        for (int i = 0; i < palindrome.length()/2; i++) {
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i) == palindrome.charAt(palindrome.length()-i-1));
        }
        if (isPalindrome)
            System.out.println(palindrome + " is palindrome.");
        else {
            System.out.println(palindrome + " isn't palindrome/");
            return false;
        } return true;
    }

    public static boolean palindromeSecondMethod(String str) {
        //reverse a string and compare with the original
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse +=str.charAt(i);
        }
        //reverse with StringBuffer
        //String reverse = new StringBuffer(str);
        //reverse.toString();
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println(str + " is palindrome.");
            return true;
        } else {
            System.out.println(str +  " isn't palindrome.");
            return false;
        }
    }

    public static boolean palindromeThirdMethod(String str) {
        //split the string in 2 parts and compare them(start to compare from the start and end)
        str = str.toLowerCase();
        String s1 = "";
        String s2 = "";
        for(int i=0; i < str.length()/2; i++){
            s1+=str.charAt(i);
            s2+=str.charAt(str.length()-1-i);
        }
        if(s1.equals(s2)){
            System.out.println(str + " is palindrome.");
            return true;
        }else{
            System.out.println(str + " isn't palindrome.");
            return false;
        }
    }
    public static boolean palindromeFourthMethod(String str) {
        //compare symbol by symbol(start to compare from the middle of the string)
        str = str.toLowerCase();
        String s1 = "";
        String s2 = "";
        float strHalf = str.length()/2f;
        for (int i = 0; i < str.length()/2; i++) {
            s1 += str.charAt(str.length()/2-1-i);
            s2 += str.charAt(Math.round(strHalf)+i);
        }
        if(s1.equals(s2)){
            System.out.println(str + " is a palindrome.");
            return true;
        }else{
            System.out.println(str + " isn't a palindrome.");
            return false;
        }
    }
    public static boolean palindromeFifthMethod(String str) {
        //reverse a string and compare with the original using StringBuilder
        str = str.replaceAll("\\W",""); //remove all unnecessary
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse(); //invert the line
        String invertedStr = strBuilder.toString(); //assign the inverted line
        if (str.equalsIgnoreCase(invertedStr)) {
            System.out.println(str + " is a palindrome.");
            return true;
        } else {
            System.out.println(str + " isn't a palindrome.");
            return false;
        }
    }
}