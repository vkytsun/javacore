package com.vkytsun.app.classwork.lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        System.out.println("Enter numbers using comma delimiter");
        Scanner scanner = new Scanner(System.in);
        //String inputString = scanner.nextLine();
        //String[] splittedStringArray = inputString.split(" ");
       // for(String str :splittedStringArray){
         //   System.out.println(str);
        //}
        String inputString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++){
            stringBuilder.insert(i, inputString.charAt(i));
            System.out.println(inputString.charAt(i));
        }
    }
}
