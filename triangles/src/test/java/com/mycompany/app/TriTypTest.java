package com.mycompany.app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class TriTypTest  extends TriTyp
{  
  /**
  * Tests for triang()  
  **/

  // Diff Nums makes scalene triangle
  @Test
  public void diffNums_returnsOne() {
    int expected = 1;
    int actual = TriTyp.triang(4, 2, 5);
    assertEquals(expected, actual);
  }

  // All Same Nums makes equilateral triangle
  @Test
  public void allSameNums_returnsThree() {
    int expected = 3;
    int actual = TriTyp.triang(2, 2, 2);
    assertEquals(expected, actual);
  }

  // Negative Nums makes invalid triangle
  @Test
  public void negativeNum_param1_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(-1, 1, 1);
    assertEquals(expected, actual);
  }
  @Test
  public void negativeNum_param2_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(1, -1, 1);
    assertEquals(expected, actual);
  }  
  @Test
  public void negativeNum_param3_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(1, 1, -1);
    assertEquals(expected, actual);
  }    

  // Two Same Nums makes isosceles
  @Test
  public void twoSameNums_combination1_returnsTwo() {
    int expected = 2;
    int actual = TriTyp.triang(2, 2, 1);
    assertEquals(expected, actual);
  }
  @Test
  public void twoSameNums_combination2_returnsTwo() {
    int expected = 2;
    int actual = TriTyp.triang(1, 2, 2);
    assertEquals(expected, actual);
  }  
  @Test
  public void twoSameNums_combination3_returnsTwo() {
    int expected = 2;
    int actual = TriTyp.triang(2, 1, 2);
    assertEquals(expected, actual);
  }      

  // Two Equal Sides are Less than a Side
  @Test
  public void twoEqualSidesLessThanASide_combination1_returnsTwo() {
    int expected = 2;
    int actual = TriTyp.triang(5, 5, 1);
    assertEquals(expected, actual);
  }
  @Test
  public void twoEqualSidesLessThanASide_combination2_returnsTwo() {
    int expected = 2;
    int actual = TriTyp.triang(1, 5, 5);
    assertEquals(expected, actual);
  }  
  @Test
  public void twoEqualSidesLessThanASide_combination3_returnsTwo() {
    int expected = 2;
    int actual = TriTyp.triang(1, 5, 5);
    assertEquals(expected, actual);
  }   
  @Test
  public void twoEqualSidesLessThanASide_combination4_returnsTwo() {
    int expected = 4;
    int actual = TriTyp.triang(1, 2, 5);
    assertEquals(expected, actual);
  }
  @Test
  public void twoSidesLessThanASide_combination5_returnsTwo() {
    int expected = 4;
    int actual = TriTyp.triang(5, 2, 1);
    assertEquals(expected, actual);
  }  
  @Test
  public void twoEqualSidesLessThanASide_combination6_returnsTwo() {
    int expected = 4;
    int actual = TriTyp.triang(5, 2, 1);
    assertEquals(expected, actual);
  }         

  // Two Unequal Sides are Less than a Side
  @Test
  public void twoUnequalSidesLessThanASide_combination1_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(5, 3, 1);
    assertEquals(expected, actual);
  }
  @Test
  public void twoUnequalSidesLessThanASide_combination2_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(1, 3, 5);
    assertEquals(expected, actual);
  }  
  @Test
  public void twoUnequalSidesLessThanASide_combination3_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(1, 5, 3);
    assertEquals(expected, actual);
  }   

  // Unequal nums
  @Test
  public void unequalNums_combination1_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(7, 10, 3);
    assertEquals(expected, actual);
  }
  @Test
  public void unequalNums_combination2_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(3, 10, 7);
    assertEquals(expected, actual);
  }  
  @Test
  public void unequalNums_combination3_returnsFour() {
    int expected = 4;
    int actual = TriTyp.triang(10, 7, 3);
    assertEquals(expected, actual);
  }        

  /**
   * Tests for getN()  
   **/
  @Test
  public void testSingleInput() {
    int example = 1; //the line we will try to read
    InputStream stream = new ByteArrayInputStream((example+"\n").getBytes(StandardCharsets.UTF_8)); //this stream will output the example string
    InputStream stdin = System.in; //save the standard in to restore it later
    System.setIn(stream); //set the standard in to the mocked stream
    assertEquals(example, TriTyp.getN()); //check if the method works
    System.setIn(stdin);//restore the stardard in
  }

  private final InputStream systemIn = System.in;
  private static final PrintStream systemOut = System.out;

  private ByteArrayInputStream testIn;
  private ByteArrayOutputStream testOut;

  @BeforeEach
  public void setUpOutput() {
      testOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(testOut));
  }

  @AfterEach
  public void restoreSystemInputOutput() {
      System.setIn(systemIn);
      System.setOut(systemOut);
  }

  private void provideInput(String data) {
      testIn = new ByteArrayInputStream(data.getBytes());
      System.setIn(testIn);
  }
  
  /**
   * Test user inputs
  */
  @Test
  public void testEmptyUserInput_equilateral() {
    String input = "";
    provideInput(input);
    String[] test = {};
    TriTyp.main(test);
    assertTrue(testOut.toString().contains("Result is: equilateral"));
  }

  @Test
  public void testNegativeNumberUserInput_notAValidTriangle() {
    String input = "-1";
    provideInput(input);
    String[] test = {};
    TriTyp.main(test);
    assertTrue(testOut.toString().contains("Result is: not a valid triangle"));
  }
}
