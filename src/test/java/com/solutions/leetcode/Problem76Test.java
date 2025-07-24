package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//76. Minimum Window Substring
public class Problem76Test {
    private final Problem76 problem76 = new Problem76();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Standard example from problem statement.
                Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
                // Both strings are empty.
                Arguments.of("", "", ""),
                // t is empty (invalid case per typical problem constraints, but handled).
                Arguments.of("abc", "", ""),
                // s is empty.
                Arguments.of("", "abc", ""),
                // s and t are identical single characters.
                Arguments.of("a", "a", "a"),
                // s does not contain enough characters from t.
                Arguments.of("a", "aa", ""),
                // t is a substring of s and is the minimum window.
                Arguments.of("pwwkew", "wk", "wk"),
                // t has duplicate characters, requiring window to meet those counts.
                Arguments.of("ADOBECODEBANC", "ABCC", "CODEBANC"),
                // t has duplicate 'A', testing window expansion.
                Arguments.of("ADOBECODEBANC", "AABC", "ADOBECODEBA"),
                // Character from t is not present in s.
                Arguments.of("abcdef", "x", ""),
                // Window is the full string when all t chars are present and ordered.
                Arguments.of("abcdef", "ace", "abcde"),
                // Tests case sensitivity, as 'A' != 'a'.
                Arguments.of("ab", "A", ""),
                // Order of characters in t doesn't matter for the window.
                Arguments.of("ADOBECODEBANC", "BAC", "BANC"),
                // s consists of many identical characters, t requires some.
                Arguments.of("AAAAAAAAAAA", "AAAA", "AAAA"),
                // Tricky duplicate handling where "baa" is the shortest for "aba".
                Arguments.of("bbaa", "aba", "baa"),
                // Complex string with multiple potential windows.
                Arguments.of("cabwefgewcwaefgcf", "cae", "cwae"),
                // s and t are identical and contain duplicates.
                Arguments.of("aa", "aa", "aa"),
                // s contains more duplicates than t needs.
                Arguments.of("abcccc", "cc", "cc"),
                // s does not contain enough instances of a character required by t.
                Arguments.of("abcc", "ccc", "")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testLengthOfLongestSubstring(String s, String t, String expected) {
        assertEquals(expected, problem76.minWindow(s, t));
    }
}

