package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem3Test {

    private final Problem3 problem3 = new Problem3();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of(null, 0),
                Arguments.of("a", 1),
                Arguments.of("abcdef", 6),
                Arguments.of("aaaaaa", 1),
                Arguments.of("abcabcbb", 3),
                Arguments.of("a b c d e", 3),
                Arguments.of("a!b@c#d$e%", 10),
                Arguments.of("1234567890", 10),
                Arguments.of("pwwkew", 3)
        );
    }

    private static Stream<Arguments> provideTestCasesCP() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of(null, 0),
                Arguments.of("a", 1),
                Arguments.of("abcdef", 6),
                Arguments.of("aaaaaa", 1),
                Arguments.of("abcabcbb", 3),
                Arguments.of("a b c d e", 3),
                Arguments.of("a!b@c#d$e%", 10),
                Arguments.of("1234567890", 10),
                Arguments.of("pwwkew", 3),
                Arguments.of("😊🚀🌟😊", 3),
                Arguments.of("🚀🌟✨🔥💧🌈", 6),
                Arguments.of("a😊b😊c😊", 3),
                Arguments.of("👨‍👩‍👧‍👦abc👨‍👩‍👧‍👦", 7), // family emoji + letters
                Arguments.of("🏳️‍🌈🏳️‍⚧️abc🏳️‍🌈", 7) // complex emoji sequences
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testLengthOfLongestSubstring(String input, int expected) {
        assertEquals(expected, problem3.lengthOfLongestSubstring(input));
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesCP")
    public void testLengthOfLongestSubstringWithCodePoints(String input, int expected) {
        assertEquals(expected, problem3.lengthOfLongestSubstringWithCodePoints(input));
    }
}

