package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//3. Longest Substring Without Repeating Characters
public class Problem3Test {
    private final Problem3 problem3 = new Problem3();
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Test case with an empty string.
                Arguments.of("", 0),
                // Test case with a null string input.
                Arguments.of(null, 0),
                // Test case with a single character string.
                Arguments.of("a", 1),
                // Test case with all unique ASCII characters.
                Arguments.of("abcdef", 6),
                // Test case with all repeating characters.
                Arguments.of("aaaaaa", 1),
                // Standard problem example where "abc" is the longest.
                Arguments.of("abcabcbb", 3),
                // Test case with spaces as distinct characters, resulting in a specific short length.
                Arguments.of("a b c d e", 3),
                // Test case with special ASCII characters.
                Arguments.of("a!b@c#d$e%", 10),
                // Test case with numeric characters.
                Arguments.of("1234567890", 10),
                // Standard problem example where "wke" is the longest.
                Arguments.of("pwwkew", 3)
        );
    }

    private static Stream<Arguments> provideTestCasesCP() {
        return Stream.of(
                // Test case with an empty string.
                Arguments.of("", 0),
                // Test case with a null string input.
                Arguments.of(null, 0),
                // Test case with a single character string.
                Arguments.of("a", 1),
                // Test case with all unique ASCII characters.
                Arguments.of("abcdef", 6),
                // Test case with all repeating characters.
                Arguments.of("aaaaaa", 1),
                // Standard problem example where "abc" is the longest.
                Arguments.of("abcabcbb", 3),
                // Test case with spaces as distinct characters, resulting in a specific short length.
                Arguments.of("a b c d e", 3),
                // Test case with special ASCII characters.
                Arguments.of("a!b@c#d$e%", 10),
                // Test case with numeric characters.
                Arguments.of("1234567890", 10),
                // Standard problem example where "wke" is the longest.
                Arguments.of("pwwkew", 3),
                // Test case with 2-char Unicode emojis, expecting length as code point count.
                Arguments.of("😊🚀🌟😊", 3),
                // Test case with 2-char Unicode emojis, expecting length as code point count.
                Arguments.of("🚀🌟✨🔥💧🌈", 6),
                // Test case with mixed ASCII and 2-char Unicode emojis, expecting length as code point count.
                Arguments.of("a😊b😊c😊", 3),
                // Test case with complex family emoji (11 chars) and letters, expecting a specific total length.
                Arguments.of("👨‍👩‍👧‍👦abc👨‍👩‍👧‍👦", 7),
                // Test case with complex flag emojis (8 chars each) and letters, expecting a specific total length.
                Arguments.of("🏳️‍🌈🏳️‍⚧️abc🏳️‍🌈", 7)
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

