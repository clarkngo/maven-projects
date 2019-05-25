package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
  /**
   * Tests for findLast
   */
  // supplied test case
  @Test
  public void findTwo() {
    // Arrange
    final int expected = 0;
    App newApp = new App();
    int[] checkArray = {2, 3, 5};
    // Act
    final int actual = newApp.findLast(checkArray, 2);

    // Assert
    assertEquals(expected, actual);
  }    
  // test case that does not execute the fault
  
  @Test
  public void find2147483648() {
    // Arrange
    final int expected = 2147483648;
    App newApp = new App();
    int[] checkArray = {2, 2147483648, 5};
    // Act
    final int actual = newApp.findLast(checkArray, 3);

    // Assert
    assertEquals(expected, actual);
  }    
  
  // test case that does execute the fault but no error
  @Test
  public void findThree() {
    // Arrange
    final int expected = 1;
    App newApp = new App();
    int[] checkArray = {2, 3, 5};
    // Act
    final int actual = newApp.findLast(checkArray, 3);

    // Assert
    assertEquals(expected, actual);
  }    
*/
  /**
   * Tests for countPositive
   */
  // supplied test case
  @Test
  public void twoPositives() {
    // Arrange
    final int expected = 2;
    App newApp = new App();
    int[] checkArray = {-4, 2, 0, 2};
    // Act
    final int actual = newApp.findLast(checkArray, 2);

    // Assert
    assertEquals(expected, actual);
  }      
  // test case that does not execute the fault
  @Test
  public void emptyArray() {
    // Arrange
    final int expected = 0;
    App newApp = new App();
    int[] checkArray = {};
    // Act
    final int actual = newApp.countPositive(checkArray);

    // Assert
    assertEquals(expected, actual);
  }    
  // test case that does execute the fault but no error
  @Test
  public void threePositives() {
    // Arrange
    final int expected = 3;
    App newApp = new App();
    int[] checkArray = {-4, 2, 1, 2};
    // Act
    final int actual = newApp.countPositive(checkArray);

    // Assert
    assertEquals(expected, actual);
  }    

}
