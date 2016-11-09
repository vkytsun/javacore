package com.vkytsun.app.utils.convertors;

/** Вопрос: почему char выводит символы, а не цифры???
 *
 */
public class PrimitiveConvertor {
    char char1 = 11;
    int int1 = 1000;
    float float1 = 7777.2323f;

    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar();
        primitiveConvertor.intToChar();
        primitiveConvertor.charToInt();
    }
    public void floatToChar() {
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output value is " + char1);
    }
    public void intToChar() {
        char1 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char1);
    }
    public void charToInt() {
        int1 = char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
}

