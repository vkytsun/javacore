package com.vkytsun.runners.homework;

import com.vkytsun.app.homework.lesson16.ListOfPeople;

import java.util.Random;
import java.util.Scanner;

/*Реализовать игру “Угадай-ка”, которая будет выводить случайным образом ФИО одного из известных людей
и предлагать пользователю ввести его возраст. В случае совпадения - выводим пользователю поздравление,
в противном случае - сообщаем что он неправ и выводим случайным образом ФИО другого известного человека.
ФИО не должно повторяться два раза подряд.
Задачу можно усложнить, спрашивая у пользователя не только возраст, а также то - жив ли этот человек или
уже нет. Игра должна завершаться после трех угаданных людей. Список людей с ФИО, их возрастами и статусами
жизни должен находится в enum.
* */
public class Lesson16Runner {
    public static void main(String[] args) {
        String inputAge = "";
        String inputStatusOfLive = "";
        String currentStar = "";
        String nextStar = "";
        int randomStar;
        int guessed = 0;
        int attempts = 0;
        ListOfPeople[] celebrities = ListOfPeople.values();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            attempts++;
            currentStar = nextStar;
            if (nextStar.equals(currentStar)) {
                randomStar = random.nextInt(celebrities.length);
                nextStar = celebrities[randomStar].getFullName();
                System.out.println("How old is " + nextStar + "?");
                inputAge = scanner.nextLine();
                //System.out.println(inputAge);
                if (Integer.parseInt(inputAge)==(celebrities[randomStar].getAge())) {
                    System.out.println("Congratulations, you guessed age!");
                    System.out.println("This person is 'alive' or 'died'?");
                    inputStatusOfLive = scanner.nextLine();
                    if (inputStatusOfLive.equalsIgnoreCase(celebrities[randomStar].getStatusOfLive())) {
                        System.out.println("Congratulations, you guessed!");
                        guessed++;
                    } else {
                        System.out.println("Unfortunately, you did not guess.");
                    }
                } else {
                    System.out.println("You did not guess age! Age is " + celebrities[randomStar].getAge());
                }
            }
        } while (guessed < 4 && attempts < 16);
        if (guessed == 3) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("You used all attemts and lose. Try again!");
        }
    }
}
