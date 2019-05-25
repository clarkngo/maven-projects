package com.mycompany.app;


public class App 
{
  /**
   * Find ;last index of element
   * 
   * @param x array to search
   * @param y value to look for
   * @return last index of y in x; -1 if absent
   * @throws NullPointerException if null
   * test: x [2, 3, 5]; y = 2; Expected = 0
   */
  public int findLast (int[] x, int y) 
  {
    for (int i = x.length - 1; i >= 0; i--) 
    {
      if (x[i] == y)
      {
        return i;
      }
    }
    return -1;
  }

  /**
   * Count positive elements
   * 
   * @param x array to search
   * @return count of positive elements in x
   * @throws NullPointerException if x is null
   * test: x [-4, 2, 0, 2]; Expected = 2
   */
  public int countPositive (int[] x)
  {
    int count = 0;
      for (int i = 0; i < x.length; i++)
      {
        if (x[i] > 0) 
        {
          count++;
        }
      }
    return count;
  }

  public static void main( String[] args )
  {
    App newApp = new App();
    int[] checkArray = {2, 3, 5};
    int find = 3;
    System.out.println(newApp.findLast(checkArray, find));
    System.out.println("h");
  }
}
