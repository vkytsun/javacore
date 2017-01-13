package com.vkytsun.app.classwork.lesson17;


public class BoxPrinter<T> {
    private T val;
    public BoxPrinter(T args) {
        val = args;
    }
    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
