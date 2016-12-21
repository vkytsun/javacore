package com.vkytsun.app.homework.lesson13;

/**
 Написать класс Human который имеет только один конструктор (конструктор должен быть с параметрами,
 принимающий на входе возраст и имя человека). Поля возраст и имя должны быть приватными, а в классе
 должны быть реализованы геттеры getName(), getAge() и сеттер setAge (int age) который проверяет что возраст
 человека находится в диапазоне 1..120 лет, и в зависимости от этого выводит сообщение “New age setted” и
 сохраняет значение в поле возраста, или выводит сообщение “Age invalid” (если возраст не входит в диапазон).
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 1 || age >= 120) {
            System.out.println("Age invalid. The age of the human should be in a range from 1 to 120 years.\n");
        } else {
            this.age = age;
            System.out.println("New age setted: " + age);
        }
    }
}
