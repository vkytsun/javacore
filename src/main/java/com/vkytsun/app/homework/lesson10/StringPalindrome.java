package com.vkytsun.app.homework.lesson10;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.List;
import java.util.Scanner;

public class StringPalindrome {
    public static boolean palindromeFirstMethod(String palindrome) {
        //compare symbols in a row on both sides to check for a palindrome
        boolean isPalindrome = true;
<<<<<<< HEAD
        for (int i = 0; i < palindrome.length() / 2; i++) {
=======
        palindrome = palindrome.toLowerCase();
        for (int i = 0; i < palindrome.length()/2; i++) {
>>>>>>> 4dcc1bcb1c739da8f5437d2976c738f2236a752b
            isPalindrome = isPalindrome &&
                    (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome)
            System.out.println(palindrome + " is palindrome.");
        else {
<<<<<<< HEAD
            System.out.println("Not palindrome");
        }
        return palindrome;
=======
            System.out.println(palindrome + " isn't palindrome/");
            return false;
        } return true;
>>>>>>> 4dcc1bcb1c739da8f5437d2976c738f2236a752b
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
<<<<<<< HEAD
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                System.out.println("Not palindrome");
=======
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
>>>>>>> 4dcc1bcb1c739da8f5437d2976c738f2236a752b
            return false;
        }
    }
<<<<<<< HEAD

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
=======
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
>>>>>>> 4dcc1bcb1c739da8f5437d2976c738f2236a752b
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

