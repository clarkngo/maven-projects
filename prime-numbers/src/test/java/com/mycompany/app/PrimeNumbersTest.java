
package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PrimeNumbersTest 
{
    @Test
    public void showFivePrimeNumbers_2_3_5_7_11() 
    {
        // arrange
        final String expected = "[2, 3, 5, 7, 11]"; 
        PrimeNumbers pNum = new PrimeNumbers();
        pNum.computePrimes(5);

        // act
        final String actual = pNum.toString();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    public void showPrimeNumbersUntil_100() 
    {
        // arrange
        final String expected = "[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]"; 
        PrimeNumbers pNum = new PrimeNumbers();
        pNum.computePrimes(25);

        // act
        final String actual = pNum.toString();

        // assert
        assertEquals(expected, actual);
    }    

    // Test that does not reach fault
    @Test
    public void showZeroPrimeNumber() 
    {
        // arrange
        final String expected = "[]"; 
        PrimeNumbers pNum = new PrimeNumbers();
        pNum.computePrimes(0);

        // act
        final String actual = pNum.toString();

        // assert
        assertEquals(expected, actual);
    }    

    // Test that does reach fault but does not infect state
    @Test
    public void showSevenPrimeNumbers() 
    {
        // arrange
        final String expected = "[2, 3, 5, 7, 11, 13, 17]"; 
        PrimeNumbers pNum = new PrimeNumbers();
        pNum.computePrimes(7);

        // act
        final String actual = pNum.toString();

        // assert
        assertEquals(expected, actual);
    }        
}
