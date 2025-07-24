package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem42Test {

    private final Problem42 problem42 = new Problem42();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{4}, 0),
                Arguments.of(new int[]{4, 2}, 0),
                Arguments.of(new int[]{2, 0, 2}, 2),
                Arguments.of(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6),
                Arguments.of(new int[]{3, 3, 3, 3}, 0),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0),
                Arguments.of(new int[]{4, 2, 0, 3, 2, 5}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testTrap(int[] height, int expected) {
        assertEquals(expected, problem42.trap(height));
    }
}
