package com.vkytsun.app.classwork.lesson10;


import com.vkytsun.app.homework.lesson4.Car;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        //инициализация данных
        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < charArrayToString.length; i++) {
            stringToDisplay += stringToDisplay;
        }
        System.out.println(stringToDisplay);
        stringToDisplay = Arrays.toString(charArrayToString)
                .replace("b", "a")
                .trim();
        System.out.println(stringToDisplay);

        char[] charA = {'e', 'v', 'a', '4', '!'};
        String charArray = Arrays.toString(charA);
        //charArray.replace('b', 'a');
        //System.out.println(charArray); - ничего не заменит, надо создать новый обьект, так как String - final
        String result = charArray.replace('b', 'a');
        String contact = result.concat(charArray);
        System.out.println(result);
        System.out.println(contact);
    }

}
