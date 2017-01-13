package com.vkytsun.app.classwork.lesson16;

public enum Company {
    T1, T2;

    public static void main(String[] args) {
        for (Company company : Company.values()) {
            System.out.println("Company value: " + company.toString());
        }
    }
}
