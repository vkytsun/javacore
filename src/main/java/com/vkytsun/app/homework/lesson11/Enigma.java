package com.vkytsun.app.homework.lesson11;

/**
 * Реализовать алгоритм шифрования Энигма в классе Enigma методами encode, decode и cipher
 * (по мотивам рассказанного в классе на занятии).
 */
public class Enigma {
    private static final String plainText = "qw@ertyu^&*iop 888VV good";
    private static final String cypherText = "asd*(!fghjk YESzxc:vbnew ";

    public static String stringEncode(String stringToEncode) {
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
