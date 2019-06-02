package com.mycompany.app;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapters 6, 7, and 9; pages ??, ??, and ??
// JUnit tests for PatternIndex.java 

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class DataDrivenPatternIndexTest {
   /*Not used
   private String subject;
   private String pattern;
   private int expected;

   public DataDrivenPatternIndexTest(String subject, String pattern, int expected) {
      this.subject = subject;
      this.pattern = pattern;
      this.expected = expected;
   }
   */

   //OLD
   // The following values are from the 1st edition, Table 2.4, page 59
   // Need an update to the new edition table number and page number.
   // @Parameters
   // public static Collection<Object[]> parameters()
   // {
   //    return Arrays.asList (new Object [][] {
   //       {"a",   "bc",  -1},
   //       {"ab",  "a",    0},
   //       {"ab",  "ab",   0},
   //       {"ab",  "ac",  -1},
   //       {"ab",  "b",    1},
   //       {"ab",  "c",   -1},
   //       {"abc", "abc",  0},
   //       {"abc", "abd", -1},
   //       {"abc", "ac",  -1},
   //       {"abc", "ba",  -1},
   //       {"abc", "bc",   1}
   //    });
   // }

   //NEW
   private static Stream<Arguments> provideValuesForDataFlowTests() {
      return Stream.of(
         Arguments.of("a",   "bc",  -1),
         Arguments.of("ab",  "a",    0),
         Arguments.of("ab",  "ab",   0),
         Arguments.of("ab",  "ac",  -1),
         Arguments.of("ab",  "b",    1),
         Arguments.of("ab",  "c",   -1),
         Arguments.of("abc", "abc",  0),
         Arguments.of("abc", "abd", -1),
         Arguments.of("abc", "ac",  -1),
         Arguments.of("abc", "ba",  -1),
         Arguments.of("abc", "bc",   1)
      );
   }

   //OLD
   // @Test
   // public void dataFlowTests()
   // {
   //    assertEquals ("Data flow PatternIndex test", 
   //             PatternIndex.patternIndex (subject, pattern), expected);
   // }

   //NEW
   @ParameterizedTest
   @MethodSource("provideValuesForDataFlowTests")
   public void dataFlowTests(String subject, String pattern, int expected)
   {
      assertEquals (expected, PatternIndex.patternIndex (subject, pattern));
   }

}
