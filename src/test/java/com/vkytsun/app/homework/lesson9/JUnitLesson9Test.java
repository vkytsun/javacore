package com.vkytsun.app.homework.lesson9;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class JUnitLesson9Test {
    @Test
    @FileParameters(value = "src/test/java/resources/homework/lesson9/bubbleSortMinToMax", mapper = CsvWithHeaderMapper.class)
    public void bubbleSortMinToMax(int [] array, int[] expRes) throws Exception {
        int[] actualResult = SortingArray.bubbleSortMinToMax(array);
        Assert.assertArrayEquals(expRes, actualResult);
    }

    @Test
    public void bubbleSortMaxToMin() throws Exception {

    }

    @Test
    public void selectionSortArray() throws Exception {

    }

    @Test
    public void multiDimensionArrayMaxElement() throws Exception {

    }

}