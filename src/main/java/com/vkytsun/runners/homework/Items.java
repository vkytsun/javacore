package com.vkytsun.runners.homework;

public class Items {

    public static int convert(String numberOfTask) {
        String number;
        for (ItemsOfMenu items: ItemsOfMenu.values()) {
            System.out.println(items.name() + " : " + items.getValue());
            if (numberOfTask.equals(items.getValue())) {
                //number = items;
            }
        }
        return 0;
    }

}
