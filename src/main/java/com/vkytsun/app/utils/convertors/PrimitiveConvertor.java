package com.vkytsun.app.utils.convertors;

/** Вопрос: почему char выводит символы, а не цифры???
 *
 */
public class PrimitiveConvertor {
    /**char char1 = '\000';
    int int1 = 55;
    float float1 = 56f;
*/
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.floatToChar(22f);
        primitiveConvertor.intToChar(999);
        primitiveConvertor.charToInt('A');
    }
    public void floatToChar(float floatVariable) {
        char charVariable = (char) floatVariable;
        System.out.println("Input float value is " + floatVariable + ". Output value is " + charVariable);
    }
    public void intToChar(int intVariable) {
        char charVariable = (char) intVariable;
        System.out.println("Input int value is " + intVariable + ". Output char value is " + charVariable);
    }
    public void charToInt(char charVariable) {
        int intVariable = (char) charVariable;
        System.out.println("Input char value is " + charVariable + ". Output int value is " + intVariable);
    }
}

