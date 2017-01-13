package com.vkytsun.app.classwork.lesson16;


public enum Holidays {
    NEW_YEAR(1,"January","New Year"),
    CHRISTMAS(7,"January","Christmas"),
    INDEPENDENCE_DAY(24,"August", "Independence day");

    private int date;
    private String month;
    private String nameOfHoliday;

    Holidays(int date, String month, String nameOfHoliday) {
        this.date = date;
        this.month = month;
        this.nameOfHoliday = nameOfHoliday;
    }
/*
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNameOfHoliday() {
        return nameOfHoliday;
    }

    public void setNameOfHoliday(String nameOfHoliday) {
        this.nameOfHoliday = nameOfHoliday;
    }*/

    @Override
    public String toString() {
        return "\""+ nameOfHoliday + " holiday is on " + month + ", " + date +
                ".\"";
    }
}
