package com.vkytsun.app.classwork.lesson10;

/**
 * Created by vkytsun on 06.12.16.
 */
public class ConvertString {
    public static void main(String[] args) {
        double dot = 1000.02;
        String display = String.valueOf(dot);
        System.out.println(display);
        float a = 'A';
        String AB = String.valueOf(a);
        System.out.println(AB);
        int b = '1';
        String ba = String.valueOf(b);
        System.out.println(ba);
        String toFloat = "0.55";
        Float fin = Float.valueOf(toFloat);
        System.out.println(fin);
        // s.split розділяє значення і створює массив
        String s = "1,2,3,4,5,6,7,8";
        String [] filteredData = s.split(",");
        System.out.println(filteredData);
        String summary = filteredData[2];
        int summaInt = Integer.parseInt(summary);
        System.out.println(summaInt);
        int summar = 3333;
        String sum = String.valueOf(summar);
        System.out.println(sum);

    }

    public static void displayText(Integer number, String name) {
        System.out.println(number);
        System.out.println(name);
    }
    public static void displayText(String name, Integer number) {
        System.out.println(name);
        System.out.println(number);
    }
    public static void displayText(Double dd) {
        System.out.println(dd);
    }
    public static void displayText(Boolean bol) {
        System.out.println(bol);
    }
}
