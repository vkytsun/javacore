package com.vkytsun.app.homework.lesson9;

/**
 Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил
 начинать каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения,
 но в классе 15 человек, а примеры среди них не должны повторяться. В помощь учителю напишите программу,
 которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9,
 потому что задания по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров не должно быть
 повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися). */
//not finished
public class MultiplyTab {
    public static int[][] multiplyTabArray() {
        int[][] multTab = new int[9][9];
        System.out.println("Multiplication table: ");
        for (int i = 0; i < multTab.length; i++) {
            for (int j = 0; j < multTab.length; j++) {
                multTab[i][j] = (i+1) * (j+1);
                System.out.print(multTab[i][j] + " ");
                }
            System.out.println();
        }
        return multTab;
    }
}
