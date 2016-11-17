package com.vkytsun.app.lesson4HomeworkTest;

import com.vkytsun.app.homework.lesson4.Car;
import org.junit.Assert;
import org.junit.Test;

/** Created by vkytsun on 14.11.16. */

public class CarTest {
    @Test
    public void ConditionTrue1() {
        Car car_one = new Car(100, "Mercedes");
        Car car_two = new Car(100, "BMW");
        /** checking if a condition is true */
        Assert.assertTrue(car_one.getPriceOfTheCar() == car_two.getPriceOfTheCar());
        }
    @Test
    public void ConditionTrue2() {
         Car car_one = new Car(100, "Mercedes");
         Car car_three = new Car(120, "Mercedes");
         /** checking if a condition is true */
         Assert.assertFalse(car_one.getPriceOfTheCar() == car_three.getPriceOfTheCar());
     }
    @Test
    public void ConditionFalse() {
        Car car_one = new Car(100, "Mercedes");
        Car car_three = new Car(120, "Mercedes");
        /** checking if a condition is false */
        Assert.assertFalse(car_one.getPriceOfTheCar() == car_three.getPriceOfTheCar());
    }
    @Test
    public void ConditionNull() {
        Car car_four = null;
        /** checking if an object is null */
        Assert.assertNull(car_four);
    }
    @Test
    public void ObjectIsNotNull() {
        Car car_three = new Car(120, "Mercedes");
        /** checking if an object is not null */
        Assert.assertNotNull(car_three);
    }
    @Test
    public void TwoObjectsEqual() {
        Car car_one = new Car(100, "Mercedes");
        Car car_three = new Car(120, "Mercedes");
        /** checking if two objects are equal */
        Assert.assertEquals(car_one.getModelOfTheСar(), car_three.getModelOfTheСar());
    }
    @Test
    public void TwoObjectsReferencesPoit(){
        Car car_one = new Car(100, "Mercedes");
        Car car_five = car_one;
        /** checking if two objects references point the same object */
        Assert.assertSame(car_one, car_five);
        }
    @Test
    public void TwoObjectsReferencesNotPoint() {
        Car car_one = new Car(100, "Mercedes");
        Car car_four = null;
        /** checking if two objects references do not point the same object */
        Assert.assertNotSame(car_one, car_four);
        }
    @Test
    public void TwoArraysEqual() {
        Car car_one = new Car(100, "Mercedes");
        Car car_two = new Car(100, "BMW");
        Car car_three = new Car(120, "Mercedes");
        Car[] allCars_one = {car_one, car_two, car_three};
        Car[] allCars_two = {car_one, car_two, car_three};
        /** checking if two arrays are the equal */
        Assert.assertArrayEquals(allCars_one, allCars_two);
        }
}
