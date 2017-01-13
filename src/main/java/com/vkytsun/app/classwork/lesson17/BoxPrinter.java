package com.vkytsun.app.classwork.lesson17;


public class BoxPrinter<T> {
    private T val;
    //T stands for "Type" - this is placeholder
    public BoxPrinter(T args)
    {
        val = args;
    }
    public String toString()
    {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
