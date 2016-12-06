package com.vkytsun.app.homework.lesson9;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayPrintTest {
    @Test
    public void arrayPrintClass() {
        ArrayPrint arrayPrint = new ArrayPrint();
    }
    @Test
    public void bubbleSortMaxToMinArray() throws Exception {
        int[] arrayInput = {44,12,9,7,81,15,90};
        int[] expectedResult = {90,81,44,15,12,9,7};
        int[] actualSortedArray = SortingArray.bubbleSortMaxToMin(arrayInput);
        int[] actualResult = ArrayPrint.bubbleSortMaxToMinArray(actualSortedArray);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void bubbleSortMinToMaxArray() throws Exception {
        int[] arrayInput = {23,14,6,0,44,78,91,34,66,12};
        int[] expectedResult = {0,6,12,14,23,34,44,66,78,91};
        int[] actualSortedArray = SortingArray.bubbleSortMinToMax(arrayInput);
        int[] actualResult = ArrayPrint.bubbleSortMintoMaxArray(actualSortedArray);
        Assert.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void selectionSortMinToMaxArray() throws Exception {
        int[] arrayInput = {23,14,6,0,44,78,91,34,66,12};
        int[] expectedResult = {0,6,12,14,23,34,44,66,78,91};
        int[] actualSortedArray = SortingArray.selectionSortMinToMax(arrayInput);
        int[] actualResult = ArrayPrint.selectionSortMinToMaxArray(actualSortedArray);
        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void selectionSortMaxToMinArray() throws Exception {
        int[] arrayInput = {44,12,9,7,81,15,90};
        int[] expectedResult = {90,81,44,15,12,9,7};
        int[] actualSortedArray = SortingArray.selectionSortMaxToMin(arrayInput);
        int[] actualResult = ArrayPrint.selectionSortMaxToMinArray(actualSortedArray);
        Assert.assertArrayEquals(expectedResult,actualResult);

    }

}