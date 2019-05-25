package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  /**
   * Rigorous Test :-)
   */
 
  @Test
  public void mergeTwoStringVectors()
  {
    // Arrange

    /**
     * Arrange for expected
     */    

    /* Vector of initial capacity(size) of 2 */
    Vector<Object> vec0 = new Vector<Object>(2);
    vec0.addElement("Apple");
    vec0.addElement("Orange");
    vec0.addElement("Mango");
    vec0.addElement("Fig");
    final Object expected = vec0;

    /**
     * Arrange for actual
     */

    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec1 = new Vector<String>(2);
    vec1.addElement("Apple");
    vec1.addElement("Orange");

    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec2 = new Vector<String>(2);

    vec2.addElement("Mango");
    vec2.addElement("Fig");

    // Act
    final Object actual = App.union(vec1, vec2);

    // Assert
    Assert.assertEquals(actual, expected);
  }    

  @Test
  public void mergeTwoIntegerVectors()
  {
    // Arrange

    /**
     * Arrange for expected
     */    

    /* Vector of initial capacity(size) of 2 */
    Vector<Object> vec0 = new Vector<Object>(2);
    vec0.addElement(1);
    vec0.addElement(2);
    vec0.addElement(3);
    vec0.addElement(4);
    final Object expected = vec0;

    /**
     * Arrange for actual
     */

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec1 = new Vector<Integer>(2);
    vec1.addElement(1);
    vec1.addElement(2);

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec2 = new Vector<Integer>(2);

    vec2.addElement(3);
    vec2.addElement(4);

    // Act
    final Object actual = App.union(vec1, vec2);

    // Assert
    Assert.assertEquals(actual, expected);
  }      

  // allows union of different Vector data type if both vectors are empty
  @Test
  public void mergeTwoEmptyVectors()
  {
    // Arrange

    /**
     * Arrange for expected
     */    

    /* Vector of initial capacity(size) of 2 */
    Vector<Object> vec0 = new Vector<Object>(2);
    vec0.addElement(1);
    vec0.addElement(2);
    final Object expected = vec0;

    /**
     * Arrange for actual
     */

    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec1 = new Vector<String>(2);

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec2 = new Vector<Integer>(2);
    vec2.addElement(1);
    vec2.addElement(2);

    // Act
    final Object actual = App.union(vec1, vec2);

    // Assert
    Assert.assertEquals(actual, expected);
  }       
  
  // allows union of Vector Integer data type with empty Vector String data type
  @Test
  public void mergeWithEmptyStringVector()
  {
    // Arrange

    /**
     * Arrange for expected
     */    

    /* Vector of initial capacity(size) of 2 */
    Vector<Object> vec0 = new Vector<Object>(2);
    vec0.addElement(1);
    vec0.addElement(2);
    final Object expected = vec0;

    /**
     * Arrange for actual
     */

    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec1 = new Vector<String>(2);

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec2 = new Vector<Integer>(2);
    vec2.addElement(1);
    vec2.addElement(2);

    // Act
    final Object actual = App.union(vec1, vec2);

    // Assert
    Assert.assertEquals(actual, expected);
  }          

  // allows union of Vector String data type with empty Vector Integer data type
  @Test
  public void mergeWithEmptyIntegerVector()
  {
    // Arrange

    /**
     * Arrange for expected
     */    

    /* Vector of initial capacity(size) of 2 */
    Vector<Object> vec0 = new Vector<Object>(2);
    vec0.addElement("Apple");
    vec0.addElement("Orange");
    final Object expected = vec0;

    /**
     * Arrange for actual
     */

    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec1 = new Vector<String>(2);
    vec1.addElement("Apple");
    vec1.addElement("Orange");

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec2 = new Vector<Integer>(2);

    // Act
    final Object actual = App.union(vec1, vec2);

    // Assert
    Assert.assertEquals(actual, expected);
  }      

  // allows union of Vector String data type with empty Vector Integer data type
  @Test
  public void mergeWithDifferentDataTypesVector()
  {
    // Arrange

    /**
     * Arrange for expected
     */    

    /* Vector of initial capacity(size) of 2 */
    Vector<Object> vec0 = new Vector<Object>(2);
    vec0.addElement("Apple");
    vec0.addElement("Orange");
    vec0.addElement(1);
    vec0.addElement(2);
    final Object expected = vec0;

    /**
     * Arrange for actual
     */

    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec1 = new Vector<String>(2);
    vec1.addElement("Apple");
    vec1.addElement("Orange");

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec2 = new Vector<Integer>(2);
    vec2.addElement(1);
    vec2.addElement(2);

    // Act
    final Object actual = App.union(vec1, vec2);

    // Assert
    Assert.assertEquals(actual, expected);
  }          
}
