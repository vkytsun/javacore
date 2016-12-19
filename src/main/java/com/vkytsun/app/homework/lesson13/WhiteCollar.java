package com.vkytsun.app.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Реализовать класс WhiteCollar, который наследует Human и в конструкторе принимает значения возраста, имени и компании,
 * при этом вызывая родительский конструктор для сохранения в приватные поля имени и возраста.
 Реализовать сеттер setCompany (String string), который сохраняет в поле companyName введенное значение, если оно состоит
 только из латинских символов, тире, пробела и/или запятых. В противном случае выводится сообщение “Company name is invalid”.
 */
public class WhiteCollar extends Human{
    private String companyName;

    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        Pattern p = Pattern.compile("([a-zA-Z\\s,-])*");
        Matcher m = p.matcher(companyName);
        if (m.matches() == true) {
            this.companyName = companyName;
            System.out.println("Company name is: " + companyName);
        } else {
            System.out.println("Company name is invalid. Please enter correct name which consists of latin characters, dash, rules and/or commas. ");
        }
    }
}
