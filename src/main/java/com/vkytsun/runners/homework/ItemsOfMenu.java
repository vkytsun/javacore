package com.vkytsun.runners.homework;

public enum ItemsOfMenu {
    TASK0("0"), TASK1("1"), TASK2("2"), TASK3("3"), TASK4("4"), TASK5("5");
     private String value;

    ItemsOfMenu(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
