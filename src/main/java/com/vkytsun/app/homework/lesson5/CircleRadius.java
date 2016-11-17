package com.vkytsun.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by vkytsun on 11/16/16.
 */
public class CircleRadius {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius ");
        /*We are storing the entered radius in double
       * because a user can enter radius in decimals
       */
        double radius = scanner.nextDouble();
        //Area = PI*radius*radius
        System.out.println("Please enter pi value");
        double pi = scanner.nextDouble();

        //double circleArea = pi * radius * radius;
        //Circumference = 2*PI*radius
      //  System.out.println("Area is " + circleArea%1000);
        calcCircleArea(pi,radius);
    }

    public static double calcCircleArea(double pi, double radius){
        double circleArea = pi * radius * radius;
        System.out.println("Area is " + circleArea%1000);
        return circleArea;
    }
 }
