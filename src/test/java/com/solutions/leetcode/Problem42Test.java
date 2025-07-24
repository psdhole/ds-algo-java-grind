package com.solutions.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem42Test {

    private final Problem42 problem42 = new Problem42();

    @Test
    public void testEmptyArray() {
        assertEquals(0, problem42.trap(new int[] {}));
    }

    @Test
    public void testSingleBar() {
        assertEquals(0, problem42.trap(new int[] {4}));
    }

    @Test
    public void testTwoBars() {
        assertEquals(0, problem42.trap(new int[] {4, 2}));
    }

    @Test
    public void testSimpleValley() {
        assertEquals(2, problem42.trap(new int[] {2, 0, 2}));
    }

    @Test
    public void testMultipleValleys() {
        assertEquals(6, problem42.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    public void testFlatSurface() {
        assertEquals(0, problem42.trap(new int[] {3, 3, 3, 3}));
    }

    @Test
    public void testDescendingBars() {
        assertEquals(0, problem42.trap(new int[] {5, 4, 3, 2, 1}));
    }

    @Test
    public void testAscendingBars() {
        assertEquals(0, problem42.trap(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testLargeValley() {
        assertEquals(9, problem42.trap(new int[] {4,2,0,3,2,5}));
    }
}
