package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class LinearSearchTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ffindNumberTwo_ReturnsZero()
    {
        // arrange
        int expected = 0; 
        int[] myArr = {2, 4, 6, 8};
        int target = 2;
        // act
        int actual = LinearSearch.search(myArr, target);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void findNumberThree_ReturnsNegativeOne()
    {
        // arrange
        int expected = - 1; 
        int[] myArr = {2, 4, 6, 8};
        int target = 3;
        // act
        int actual = LinearSearch.search(myArr, target);
        // assert
        assertEquals(expected, actual);
    }    

    @Test
    public void findEquivalentOfCharZero_ReturnsOne()
    {
        // arrange
        int expected = 1; 
        int[] myArr = {2, 48, 6, 8};
        int target = '0' - 0;
        // act
        int actual = LinearSearch.search(myArr, target);
        // assert
        assertEquals(expected, actual);
    }        

    @Test
    public void findNumberEight_ReturnsThree()
    {
        // arrange
        int expected = 3; 
        int[] myArr = {2, 48, 6, 8};
        int target = 8;
        // act
        int actual = LinearSearch.search(myArr, target);
        // assert
        assertEquals(expected, actual);
    }      
    @Test
    public void findChar0_ReturnsOne()
    {
        // arrange
        int expected = 1; 
        int[] myArr = {2, 48, 6, 8};
        char target = '0';
        // act
        int actual = LinearSearch.search(myArr, target);
        // assert
        assertEquals(expected, actual);
    }         

    @Test
    public void findIntMaxValue_ReturnsTwo()
    {
        // arrange
        int expected = 2; 
        int[] myArr = {2, 48, 2147483647, 8};
        int target = Integer.MAX_VALUE;
        // act
        int actual = LinearSearch.search(myArr, target);
        // assert
        assertEquals(expected, actual);
    }         

}
