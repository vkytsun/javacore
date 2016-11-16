package com.vkytsun.app.lesson5Classwork;

import java.util.Scanner;

public class Bank {
    private static final float USD_RATE = 26.0162f;
    /**  final - constanta(значение переменной назначается один раз)
     * если переменная static, то переменная будет общая для всех экземпляров класса (создается один раз)*/
    private String bankName;
    /** создаем конструктор который инициализирует имя переменной */
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void showName() {
        System.out.println("Bank name: " + bankName);
    }
    /** из-за того что переменная Final код не скомпилируется
    public void setUsdRate(float USD_RATE) {
        this.USD_RATE = USD_RATE;
    }
    */
    public static float getUsdRate() {
        return USD_RATE;
    }

    public boolean isLoanCanBeIssued(Person person) {
        boolean result = false;
        int score = 0;
        if (person.getAge() >= 18 && person.getAge() < 70) {
            score++;
        }
        if (person.isWorkFlag()==true) {
            score++;
        }
        if (person.getSalary() > 4000) {
            score++;
        }
        if (person.isFeedbackFlag()) {
            score++;
        }
        if (person.getWorkingTime() >= 2) {
            score++;
        }

        System.out.println("Our score: " + score);

        if (score < 3 ) {
            System.out.print("Would your like bind your house? Enter 1 ");
            Scanner sc = new Scanner(System.in);
                    if (sc.nextInt() == 1) { //** считываем с консоли что ввели */
                        return true;
                    }
        }
        else {
            result = true;
        }
            return result;
    }
}
