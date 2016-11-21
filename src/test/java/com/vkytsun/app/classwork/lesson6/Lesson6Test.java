package com.vkytsun.app.classwork.lesson6;


import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Lesson6Test {
    @Test
    @FileParameters(value = "src/test/java/resources/classwork/lesson6/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void parametrizedTest(int a, int b, int c) {
        Assert.assertEquals(a*b, c);
    }
}


