package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//340. Longest Substring with At Most K Distinct Characters
public class Problem340Test {

    private final Problem340 problem340 = new Problem340();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Example case string with 2 distinct chars, k=2
                Arguments.of("eceba", 2, 3),
                // String with only one distinct character, k=1.
                Arguments.of("aa", 1, 2),
                // Empty string input.
                Arguments.of("", 2, 0),
                // Null string input.
                Arguments.of(null, 2, 0),
                // k is 0, should return 0 length.
                Arguments.of("abc", 0, 0),
                // k is greater than or equal to total unique characters in string.
                Arguments.of("abc", 3, 3),
                // String with multiple pairs of distinct characters.
                Arguments.of("aabbccddeeff", 2, 4),
                // String with multiple sets of three distinct characters.
                Arguments.of("aabbccddeeff", 3, 6),
                // Mixed case with characters needing careful distinct count tracking.
                Arguments.of("ababffzzeee", 3, 7),
                // Longer string with repeating pattern and k distinct.
                Arguments.of("abcadcacacaca", 3, 11),
                // String with only one distinct character, k=1.
                Arguments.of("aaaaaaa", 1, 7),
                // Single character string, k=1.
                Arguments.of("a", 1, 1),
                // Single character string, k greater than 1.
                Arguments.of("a", 2, 1),
                // Repeating pattern, k=2, longest substring will be 2.
                Arguments.of("abcabcabc", 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testLengthOfLongestSubstringKDistinct(String input, int k, int expected) {
        assertEquals(expected, problem340.lengthOfLongestSubstringKDistinct(input, k));
    }
}
