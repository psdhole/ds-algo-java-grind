package com.solutions.leetcode;

import java.util.Arrays;

//881. Boats to Save People
public class Problem881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
}