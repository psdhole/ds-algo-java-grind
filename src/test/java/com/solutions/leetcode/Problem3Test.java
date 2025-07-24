package com.solutions.leetcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem3Test {
final Problem3 problem3 = new Problem3();
    @Test
    public void testEmptyString() {
        assertEquals(0, problem3.lengthOfLongestSubstring(""));
        assertEquals(0, problem3.lengthOfLongestSubstring(null));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, problem3.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertEquals(6, problem3.lengthOfLongestSubstring("abcdef"));
    }

    @Test
    public void testAllSameCharacters() {
        assertEquals(1, problem3.lengthOfLongestSubstring("aaaaaa"));
    }

    @Test
    public void testRepeatingCharacters() {
        assertEquals(3, problem3.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testStringWithSpaces() {
        assertEquals(3, problem3.lengthOfLongestSubstring("a b c d e"));
    }

    @Test
    public void testStringWithSpecialCharacters() {
        assertEquals(10, problem3.lengthOfLongestSubstring("a!b@c#d$e%"));
    }

    @Test
    public void testStringWithDigits() {
        assertEquals(10, problem3.lengthOfLongestSubstring("1234567890"));
    }

    @Test
    public void testLongStringWithRepeats() {
        assertEquals(3, problem3.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testUnicodeCharactersWithCP() {
        assertEquals(3, problem3.lengthOfLongestSubstringWithCodePoints("😊🚀🌟😊"));
    }
}
