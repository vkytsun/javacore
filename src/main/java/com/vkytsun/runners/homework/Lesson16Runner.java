package com.vkytsun.runners.homework;

import com.vkytsun.app.homework.lesson16.ListOfPeople;

import java.util.Arrays;
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
    public static boolean[] randomIdRepeat;
    public static void main(String[] args) {
        String inputAge;
        String inputStatusOfLive;
        String randomStar;
        int randomId;
        int guessed = 0;
        int attempts = 0;
        ListOfPeople[] celebrities = ListOfPeople.values();
        //System.out.println(Arrays.toString(celebrities));
        randomIdRepeat = new boolean[celebrities.length];
        for (int i = 0; i < randomIdRepeat.length; i++) {
            randomIdRepeat[i] = false;
        }
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (guessed < 3 && attempts < randomIdRepeat.length) {
            try {
                attempts++;
                randomId = random.nextInt(celebrities.length);
                if (randomIdRepeat[randomId] == true) {
                    random.nextInt(celebrities.length);
                } else {
                    randomIdRepeat[randomId] = true;
                    randomStar = celebrities[randomId].getFullName();
                    System.out.println("How old is " + randomStar + "?");
                    inputAge = scanner.nextLine();
                    //System.out.println(inputAge);
                    if (Integer.parseInt(inputAge) == (celebrities[randomId].getAge())) {
                        System.out.println("Congratulations, you guessed age!");
                        System.out.println("This person is 'alive' or 'died'?");
                        inputStatusOfLive = scanner.nextLine();
                        if (inputStatusOfLive.equalsIgnoreCase(celebrities[randomId].getStatusOfLive())) {
                            System.out.println("Congratulations, you guessed!");
                            guessed++;
                        } else {
                            System.out.println("Unfortunately, you did not guess.");
                        }
                    } else {
                        System.out.println("You did not guess age! Age is " + celebrities[randomId].getAge());
                    }
                }
            } catch(NumberFormatException e ){
                System.out.println("You have entered incorrect format of age. Try again!");
            }
        } if (guessed == 3) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("You used all attemts and lose. Try again!");
        }
    }
}