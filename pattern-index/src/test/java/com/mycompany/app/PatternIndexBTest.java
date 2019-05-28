package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PatternIndexBTest 
{
    @Test
    public void doesNotReach_shouldReturnAnyIndex()
    {
      // arrange
      final int expected = 1;

      // act
      final int actual = PatternIndexB.patternIndex("hello", "ell");

      // assert
      assertEquals(expected, actual);
    }
    
    @Test
    public void reachTheStatement_shouldReturnOne()
    {
      // arrange
      final int expected = 1;

      // act
      final int actual = PatternIndexB.patternIndex("hello", "ell");

      // assert
      assertEquals(expected, actual);
    }

    @Test
    public void reachAndInfect_ButNotPropagate_shouldReturnOne()
    {
      // arrange
      final int expected = 1;

      // act
      final int actual = PatternIndexB.patternIndex("hello", "ell");

      // assert
      assertEquals(expected, actual);
    }    

    // Test will fail with mutants and pass without mutants

    // @Test
    // public void stronglyKillMutants_shouldReturnOne()
    // {
    //   // arrange
    //   final int expected = 7;

    //   // act
    //   final int actual = PatternIndexB.patternIndex("hello_hesso", "ess");

    //   // assert
    //   assertEquals(expected, actual);
    // }        
}
