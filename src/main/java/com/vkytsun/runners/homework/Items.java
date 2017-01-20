package com.vkytsun.runners.homework;

public class Items {

    public static ItemsOfMenu convert(String task) {

        ItemsOfMenu number = null;
        for (ItemsOfMenu items: ItemsOfMenu.values()) {
            //System.out.println(items.name() + " : " + items.getValue());
            if (task.equals(items.getValue())) {
                number = items;
                //System.out.println(number);
            }
        }
        return number;
    }

}
