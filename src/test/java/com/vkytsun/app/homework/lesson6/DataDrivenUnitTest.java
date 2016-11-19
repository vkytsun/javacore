package com.vkytsun.app.homework.lesson6;

import com.vkytsun.app.homework.lesson5.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataDrivenUnitTest {
    @Test
    @FileParameters(value = "src/test/java/resources/lesson6Homework/circleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleArea(double pi, double r, double circleArea) {
        double actualResult = CircleArea.calcCircleArea(pi,r);
        Assert.assertEquals(circleArea, actualResult, 1e-5);
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson6Homework/circleAreaBigger.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleAreaBigger(double r1, double r2, double circleArea) {
        double actualResult = CircleAreaBigger.calcBiggerArrea(r1, r2);
        Assert.assertEquals(circleArea, actualResult, 1e-4);
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson6Homework/right-angled triangle.csv", mapper = CsvWithHeaderMapper.class)
    public void pythagoreanTheorem(double a, double b, double c) {
        double actualResult = RightAngledTriangle.pythagoreanTheorem(a, b);
        Assert.assertEquals(c, actualResult, 1e-5);
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson6Homework/evenOdd.csv", mapper = CsvWithHeaderMapper.class)
    public void defEvenOdd(int z, int x) {
        int actualResult = EvenOdd.defEvenOdd(x);
        Assert.assertEquals(z, actualResult);
    }

    @Test
    @FileParameters(value = "src/test/java/resources/lesson6Homework/biggerSmaller.csv", mapper = CsvWithHeaderMapper.class)
    public void defBiggerSmaller(int a, int b, int c) {
        int actualResult = BiggerNumber.calcBiggerNumber(a, b);
        Assert.assertEquals(c, actualResult);
    }
}
