package com.vkytsun.app.homework.lesson9;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SortingArrayTest {
    @Test
    public void sortingArrayClass() {
        SortingArray sortingArray = new SortingArray();
    }
    @Test
    public void bubbleSortMinToMax() throws Exception {
        int[] arrayInput = {23,14,6,0,44,78,91,34,66,12};
        int[] expectedResult = {0,6,12,14,23,34,44,66,78,91};
        int[] actualResult = SortingArray.bubbleSortMinToMax(arrayInput);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void bubbleSortMaxToMin() throws Exception {
        int[] arrayInput = {44,12,9,7,81,15,90};
        int[] expectedResult = {90,81,44,15,12,9,7};
        int[] actualResult = SortingArray.bubbleSortMaxToMin(arrayInput);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void selectionSortMinToMax() throws Exception {
        int[] arrayInput = {23,14,6,0,44,78,91,34,66,12};
        int[] expectedResult = {0,6,12,14,23,34,44,66,78,91};
        int[] actualResult = SortingArray.selectionSortMinToMax(arrayInput);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void selectionSortMaxToMin() throws Exception {
        int[] arrayInput = {44,12,9,7,81,15,90};
        int[] expectedResult = {90,81,44,15,12,9,7};
        int[] actualResult = SortingArray.selectionSortMaxToMin(arrayInput);
        Assert.assertArrayEquals(expectedResult,actualResult);
    }
}