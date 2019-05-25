package com.mycompany.app;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class BoundedQueueTest 
{
  /**
   * Exception Tests 
   */

  
  @Test
  void testExpectedException_negativeCapacity() {
    // arrange, act and assert
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      new BoundedQueue(-1);
    });
  }

  @Test  
  void testExpectedException_enQueue_null() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(0);
    // act and assert
    Assertions.assertThrows(NullPointerException.class, () -> {
      myQueue.enQueue(null);
    });
  }

  @Test  
  void testExpectedException_enQueue_moreThanCapacity() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(0);
    // act and assert
    Assertions.assertThrows(IllegalStateException.class, () -> {
      myQueue.enQueue(new Object());
    });
  }  

  @Test  
  void testExpectedException_deQueue_emptyQueue() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(0);
    // act and assert
    Assertions.assertThrows(IllegalStateException.class, () -> {
      myQueue.deQueue();
    });
  }    

  /**
   * Dequeue Tests 
   */
  @Test  
  void testDequeue() {
    // arrange 
    final Object expected = true;
    BoundedQueue myQueue = new BoundedQueue(1);
    myQueue.enQueue(new Object());

    // act
    final Object actual = myQueue.deQueue() instanceof Object;

    // assert
    assertEquals(expected, actual);
  }    

  /**
   * toString Test
   */
  @Test  
  void testToString() {
    // arrange 
    final Object expected = true;
    BoundedQueue myQueue = new BoundedQueue(2);
    myQueue.enQueue(new Object());
    myQueue.enQueue(new Object());

    // act
    final Object actual = myQueue.toString() instanceof String;

    // assert
    assertEquals(expected, actual);
  }    

  /**
   * Boolean Tests 
   */
  @Test  
  void testFunctionIsEmptyTrue() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(1);

    // act 
    final boolean actual = myQueue.isEmpty();

    // assert
    assertTrue(actual);
  }    

  @Test  
  void testFunctionIsEmptyFalse() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(1);
    myQueue.enQueue(new Object());
    
    // act 
    final boolean actual = myQueue.isEmpty();
    
    // assert
    assertFalse(actual);
  }    

  @Test  
  void testFunctionIsFullTrue() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(1);
    myQueue.enQueue(new Object());

    // act 
    final boolean actual = myQueue.isFull();
    
    // assert
    assertTrue(actual);
  }    
  
  @Test  
  void testFunctionIsFullFalse() {
    // arrange 
    BoundedQueue myQueue = new BoundedQueue(1);
    
    // act 
    final boolean actual = myQueue.isFull();
    
    // assert
    assertFalse(actual);
  }      
}
