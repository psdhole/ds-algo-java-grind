package com.solutions.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//881. Boats to Save People
public class Problem881Test {

    private final Problem881 problem881 = new Problem881();

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Basic case: two people fit in one boat.
                Arguments.of(new int[]{1, 2}, 3, 1),
                // Mixed case: some pair, some go alone.
                Arguments.of(new int[]{3, 2, 2, 1}, 3, 3),
                // All go alone because limit is too small to pair.
                Arguments.of(new int[]{3, 5, 3, 4}, 5, 4),
                // Smallest person can pair with heaviest, one person remains.
                Arguments.of(new int[]{1, 2, 3}, 6, 2),
                // All people are heavy and each requires their own boat.
                Arguments.of(new int[]{5, 5, 5}, 5, 3),
                // Optimal pairing strategy for mixed weights.
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 5, 3),
                // Another optimal pairing scenario with a different limit.
                Arguments.of(new int[]{2, 3, 4, 5}, 6, 3),
                // Single person needs one boat.
                Arguments.of(new int[]{10}, 10, 1),
                // Exactly two people that perfectly meet the limit.
                Arguments.of(new int[]{10, 20}, 30, 1),
                // Two people that exceed the limit, requiring two boats.
                Arguments.of(new int[]{10, 21}, 30, 2),
                // Larger data set to test efficiency and general logic.
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 6),
                // People who perfectly pair up to the limit.
                Arguments.of(new int[]{10, 20, 30, 40}, 50, 2),
                // All people are very heavy, none can pair with others.
                Arguments.of(new int[]{60, 70, 80, 90}, 50, 4),
                // Many light people that can pair up extensively.
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 2, 3),
                // Odd number of people, showcasing how the last person is handled.
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 6, 3),
                // Tests pairing logic when duplicates are present.
                Arguments.of(new int[]{1, 1, 3, 4, 5}, 5, 3),
                // All people have the same weight, exactly at the limit.
                Arguments.of(new int[]{4, 4, 4, 4, 4}, 4, 5),
                // All people have the same weight, and can pair up.
                Arguments.of(new int[]{4, 4, 4, 4, 4}, 8, 3)
        );

    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testTrap(int[] people, int limit, int expectedBoats) {
        assertEquals(expectedBoats, problem881.numRescueBoats(people, limit));
    }
}
