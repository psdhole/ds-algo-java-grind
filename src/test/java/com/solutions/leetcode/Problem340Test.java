package com.solutions.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem340Test {
    private final Problem340 problem340 = new Problem340();
    @Test
    public void testExample1() {
        assertEquals(3, problem340.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    @Test
    public void testExample2() {
        assertEquals(2, problem340.lengthOfLongestSubstringKDistinct("aa", 1));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0,problem340.lengthOfLongestSubstringKDistinct("", 2));
    }

    @Test
    public void testNullInput() {
        assertEquals(0, problem340.lengthOfLongestSubstringKDistinct(null, 2));
    }

    @Test
    public void testKZero() {
        assertEquals(0, problem340.lengthOfLongestSubstringKDistinct("abc", 0));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertEquals(3, problem340.lengthOfLongestSubstringKDistinct("abc", 3));
    }

    @Test
    public void testLongString() {
        assertEquals(4, problem340.lengthOfLongestSubstringKDistinct("aabbccddeeff", 2));
    }
}
