package com.mycompany.app;
import java.util.*;
/**
 * Vector 
 *
 */

public class App 
{
  String name = "[Apple, Orange, Mango, Fig]";

  public static Vector union (Vector a, Vector b) {
    Vector<Object> merge = new Vector<Object>();
    merge.addAll(a);
    merge.addAll(b);
    return merge;
  }
  public static void main( String[] args )
  {
    /* Vector of initial capacity(size) of 2 */
    Vector<String> vec1 = new Vector<String>(2);

    /* Vector of initial capacity(size) of 2 */
    Vector<Integer> vec2 = new Vector<Integer>(2);

    /* Adding elements to a vector*/
    vec1.addElement("Apple");
    vec1.addElement("Orange");
    vec2.addElement(1);
    vec2.addElement(2);
    
    System.out.println(App.union(vec1, vec2)); 

  }
}
