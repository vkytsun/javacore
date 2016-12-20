package com.vkytsun.app.classwork.lesson14;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    final public String getName() {
        return name;
    }

    final public void setName(String name) {
        this.name = name;
    }
}
