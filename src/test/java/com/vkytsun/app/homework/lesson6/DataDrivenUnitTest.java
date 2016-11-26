package com.vkytsun.app.homework.lesson6;

import com.vkytsun.app.homework.lesson4.ArithmeticOperations;
import com.vkytsun.app.homework.lesson5.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

//mapper = CsvWithHeaderMapper - пропускает первую строку

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class DataDrivenUnitTest {
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/circleArea.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleArea(double r, double circleArea) {
        double actualResult = CircleArea.calcCircleArea(r);
        Assert.assertEquals(circleArea, actualResult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/circleAreaBigger.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleAreaBigger(double r1, double r2, double circleArea) {
        double actualResult = CircleArea.calcBiggerArea(r1, r2);
        Assert.assertEquals(circleArea, actualResult, 1e-4);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/rightAngledTriangle.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleEquals(double a, double b, double c, double expRes) {
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertEquals(expRes, actualResult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/rightAngledTriangleNot.csv", mapper = CsvWithHeaderMapper.class)
    public void RightAngledTriangleNotEquals(double a, double b, double c, double expRes) {
        double actualResult = RightAngledTriangle.checkRightAngledTriangle(a, b, c);
        Assert.assertNotEquals(expRes, actualResult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/evenOdd.csv", mapper = CsvWithHeaderMapper.class)
    public void defEvenOdd(int x, int expectedResult) {
        int actualResult = DefineNumber.defEvenOdd(x);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/biggerSmaller.csv", mapper = CsvWithHeaderMapper.class)
    public void defBiggerSmaller(int a, int b, int expectedResult) {
        int actualResult = DefineNumber.defBiggerNumber(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/addition.csv", mapper = CsvWithHeaderMapper.class)
    public void addition(int a, int b, int c) {
        int actualResult = ArithmeticOperations.addition(a,b);
        Assert.assertEquals(c, actualResult);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/subtraction.csv", mapper = CsvWithHeaderMapper.class)
    public void subtraction(int a, int b, int c) {
        int actualResult = ArithmeticOperations.subtraction(a,b);
        Assert.assertEquals(c, actualResult);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/sqrt.csv", mapper = CsvWithHeaderMapper.class)
    public void sqrt(double x, double expectedResult) {
        double actualResult = ArithmeticOperations.sqrt(x);
        Assert.assertEquals(expectedResult, actualResult, 1e-5);
    }
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson6/pow.csv", mapper = CsvWithHeaderMapper.class)
    public void pow(double x, double y, double expectedResult) {
        double actualResult = ArithmeticOperations.pow(x,y);
        Assert.assertEquals(expectedResult, actualResult, 1e-5);
    }
}
