package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PatternIndexATest 
{
    @Test
    public void reachTheStatement_ButNotInfect_shouldReturnNegativeOne()
    {
      // arrange
      final int expected = -1;

      // act
      final int actual = PatternIndexA.patternIndex("hello", "ellloo");

      // assert
      assertEquals(expected, actual);
    }

    @Test
    public void reachAndInfect_ButNotPropagate_shouldReturnOne()
    {
      // arrange
      final int expected = 1;

      // act
      final int actual = PatternIndexA.patternIndex("hello", "ell");

      // assert
      assertEquals(expected, actual);
    }      

    // Test will fail with mutants and pass without mutants

    // @Test
    // public void stronglyKillMutants_shouldLastIndex()
    // {
    //   // arrange
    //   final int expected = 4;

    //   // act
    //   final int actual = PatternIndexA.patternIndex("hello", "o");

    //   // assert
    //   assertEquals(expected, actual);
    // }          
}
