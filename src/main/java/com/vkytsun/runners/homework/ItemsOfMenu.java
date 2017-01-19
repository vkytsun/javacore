package com.vkytsun.runners.homework;

public enum ItemsOfMenu {
    TASK0(0), TASK1(1), TASK2(2), TASK3(3), TASK4(4), TASK5(5);
     private int value;

    ItemsOfMenu(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
