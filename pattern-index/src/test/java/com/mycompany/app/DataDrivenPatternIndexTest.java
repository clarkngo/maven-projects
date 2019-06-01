package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith (SpringExtension.class)
public class DataDrivenPatternIndexTest
{
   private String subject;
   private String pattern;
   private int expected;

   public DataDrivenPatternIndexTest (String subject, String pattern, int expected)
   {
      this.subject  = subject;
      this.pattern  = pattern;
      this.expected = expected;
   }

  // The following values are from the 1st edition, Table 2.4, page 59
  // Need an update to the new edition table number and page number.
  @TestFactory
  public static Collection<Object[]> parameters()
  {
     return Arrays.asList (new Object [][] {
      {"a",   "bc",  -1},
      {"ab",  "a",    0},
      {"ab",  "ab",   0},
      {"ab",  "ac",  -1},
      {"ab",  "b",    1},
      {"ab",  "c",   -1},
      {"abc", "abc",  0},
      {"abc", "abd", -1},
      {"abc", "ac",  -1},
      {"abc", "ba",  -1},
      {"abc", "bc",   1}
     });
  }

  @Test
  public void dataFlowTests()
  {
     assertEquals ("Data flow PatternIndex test", 
        PatternIndex.patternIndex (subject, pattern), expected);
  }
}
