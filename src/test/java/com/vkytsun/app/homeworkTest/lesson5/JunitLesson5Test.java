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
        double actualResult = CircleRadius.calcCircleArea(pi,r);
        Assert.assertEquals(Double.doubleToLongBits(expRes), Double.doubleToLongBits(actualResult));
    }
    @Test
    public void calcBigger() {
        double pi = 3.14, r1 = 10, r2 = 15;
        double actualResult1 = CircleRadius.calcCircleArea(pi, r1);
        double actualResult2 = CircleRadius.calcCircleArea(pi, r2);
        Assert.assertNotEquals(Double.doubleToLongBits(r1), Double.doubleToLongBits(actualResult1));
        Assert.assertNotEquals(Double.doubleToLongBits(r2), Double.doubleToLongBits(actualResult2));
    }
    @Test
    public void PythagoreanTheorem() {
        double a = 3, b = 4, c = 5;
        Assert.assertEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(RightAngledTriangle.PythagoreanTheorem(a,b)));
    }
}
