package com.vkytsun.app.homework.lesson17;
/*
Написать class ArraySorterGenerics который сортирует любой массив типов которые extends Numbers
- принимает этот массив в конструкторе;
- имеет не-статический метод sort() для сортировки внутреннего массива,
а также геттер для извлечения внутреннего массива из объекта
- имеет статический метод static sort() который принимает на входе любой массив типов
которые extends Numbers и возвращает этот сортированный массив*/

import java.util.Arrays;

public class ArraySorterGenerics<T extends Number> {
    private T[] t;

    public ArraySorterGenerics(T[] t) {
        this.t = t;
    }
    public void sort(){
        this.t = bubbleStaticSort(t);
    }

    public T[] getT() {
        System.out.println("\n" + "Input array:" + "\n" + Arrays.toString(t));
        return t;
    }

    public static <T extends Number> T[] bubbleStaticSort(T[] array) {
        T temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1].doubleValue() < array[j].doubleValue()) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("\n" + "Bubble sort from Min to Max:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
