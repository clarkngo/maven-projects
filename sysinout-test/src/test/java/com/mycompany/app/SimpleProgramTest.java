package com.mycompany.app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleProgramTest {
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

    // private String getOutput() {
    //     return testOut.toString();
    // }

    // @Test
    // public void testCase1() {
    //     final String testString = "Hello!";
    //     provideInput(testString);

    //     SimpleProgram.main(new String[0]);

    //     assertEquals(testString, getOutput());
    // }

    @Test
    public void testSingleInput() {
        String expected = "Hello!";

        String input = "Hello!";
        provideInput(input);
        SimpleProgram.singleInput();

        assertEquals(expected, testOut.toString());
    }

    @Test
    public void testMultipleInputs() {
        String expected = "HelloTheWorld!";

        // Use System.lineSeparator() to add multiple inputs
        String input = "Hello" + System.lineSeparator() + "The" + System.lineSeparator() + "World!";
        provideInput(input);
        SimpleProgram.multipleInputs();

        assertEquals(expected, testOut.toString());
    }
}
