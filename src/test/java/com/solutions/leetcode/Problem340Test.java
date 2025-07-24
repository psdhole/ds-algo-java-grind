package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem340Test {

    private final Problem340 problem340 = new Problem340();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("eceba", 2, 3),
                Arguments.of("aa", 1, 2),
                Arguments.of("", 2, 0),
                Arguments.of(null, 2, 0),
                Arguments.of("abc", 0, 0),
                Arguments.of("abc", 3, 3),
                Arguments.of("aabbccddeeff", 2, 4),
                Arguments.of("aabbccddeeff", 3, 6),
                Arguments.of("ababffzzeee", 3, 7),
                Arguments.of("abcadcacacaca", 3, 11),
                Arguments.of("aaaaaaa", 1, 7),
                Arguments.of("a", 1, 1),
                Arguments.of("a", 2, 1),
                Arguments.of("abcabcabc", 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testLengthOfLongestSubstringKDistinct(String input, int k, int expected) {
        assertEquals(expected, problem340.lengthOfLongestSubstringKDistinct(input, k));
    }
}
