package com.vkytsun.app.classwork.lesson11;


public class StringEncode {
    public static String stringEncode(String stringToEncode) {
        String plainText = "123 312314194fsdfd";
        String cypherText = "sd sdsdfsdfs3244fa";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);
        String encodedString = "";
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringBuilder.charAt(i) == plainText.charAt(j)) {
                    stringBuilder.setCharAt(i,cypherText.charAt(j));
                    break;
                }
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
