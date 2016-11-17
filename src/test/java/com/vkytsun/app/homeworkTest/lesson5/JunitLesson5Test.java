package com.vkytsun.app.homeworkTest.lesson5;

import com.vkytsun.app.homework.lesson5.CircleArea;
import com.vkytsun.app.homework.lesson5.CircleRadius;
import com.vkytsun.app.homework.lesson5.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vkytsun on 18.11.16.
 */
public class JunitLesson5Test {
    @Test
    public void calcCircleArea() {
        double pi = 3.14, r = 8, expRes = 200.96;
        Assert.assertEquals(Double.doubleToLongBits(expRes), Double.doubleToLongBits(CircleRadius.calcCircleArea(pi,r)));

    }
    @Test
    public void calcBigger() {
        double pi = 3.14, r1 = 10, r2 = 15;
        Assert.assertNotEquals(Double.doubleToLongBits(r1), Double.doubleToLongBits(CircleArea.calculateBiggerArrea(r1,r2)));
    }
    @Test
    public void PythagoreanTheorem() {
        double a = 3, b = 4, c = 5;
        Assert.assertEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(RightAngledTriangle.PythagoreanTheorem(a,b)));
    }
}
