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
public class PiratesTest  extends Pirates
{  

    @Test
    public void testtest() {
        Pirates.checkForWinner(true);
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
    Pirates.main(test);
    // assertTrue(testOut.toString().contains(""));
  }

  @Test
  public void test() {
      String expected = 
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          " +
        "                                                                                          ";
      Pirates.clearScreen();
  }
    @ Test
    public void trest() {
        Pirates.u = 0;
        Pirates.winA = true;
        Pirates.play();
        assertTrue(testOut.toString().contains("Result is: not a valid triangle"));
    }

//   public static void clearScreen() {
//     for (int i = 0; i < 1000; i++) {
//         System.out.println(" ");
//     }
// }
}
