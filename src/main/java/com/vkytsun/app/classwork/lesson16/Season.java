package com.vkytsun.app.classwork.lesson16;

import java.util.Arrays;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public static void main(String[] args) {
        Season season = Season.SPRING;
        if (season == Season.SPRING)
            season = Season.SUMMER;
        System.out.println(season);
            season = Season.AUTUMN;
        String currrentSeason = Season.SPRING.name(); // better way
        //String currrentSeason = season.toString(); // other way
        // return String value of enum name, e.g. SPRING
        System.out.println(currrentSeason);

        String name = "Winter";
        Season season1 = Season.valueOf(name.toUpperCase());
        // return enum static value of String
        System.out.println(season1);

        System.out.println(Arrays.toString(Season.values()));
        //output all values of enum to screen
    }
}

