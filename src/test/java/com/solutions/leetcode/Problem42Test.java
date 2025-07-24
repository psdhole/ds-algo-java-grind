package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//42. Trapping Rain Water
public class Problem42Test {

    private final Problem42 problem42 = new Problem42();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Empty array should trap no water.
                Arguments.of(new int[]{}, 0),
                // Single bar should trap no water.
                Arguments.of(new int[]{4}, 0),
                // Two bars cannot trap water.
                Arguments.of(new int[]{4, 2}, 0),
                // Basic V-shape trapping water.
                Arguments.of(new int[]{2, 0, 2}, 2),
                // Standard example from problem description.
                Arguments.of(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6),
                // Flat terrain traps no water.
                Arguments.of(new int[]{3, 3, 3, 3}, 0),
                // Decreasing bars trap no water.
                Arguments.of(new int[]{5, 4, 3, 2, 1}, 0),
                // Increasing bars trap no water.
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0),
                // Complex example with various traps and elevations.
                Arguments.of(new int[]{4, 2, 0, 3, 2, 5}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testTrap(int[] height, int expected) {
        assertEquals(expected, problem42.trap(height));
    }
}
