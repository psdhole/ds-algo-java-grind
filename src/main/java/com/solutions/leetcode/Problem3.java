package com.solutions.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//3. Longest Substring Without Repeating Characters
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        if (s == null || s.isEmpty()) {
            return maxLength;
        }
        Set<Character> uniqueChars = new HashSet<>();
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            while (uniqueChars.contains(s.charAt(end))) {
                uniqueChars.remove(s.charAt(start));
                start++;
            }
            uniqueChars.add(s.charAt(end));
            maxLength = Math.max(maxLength, (end - start + 1));
        }
        return maxLength;
    }

    public int lengthOfLongestSubstringWithCodePoints(String s) {
        int[] codePoints = s.codePoints().toArray();
        Set<Integer> uniqueChars = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < codePoints.length; end++) {
            while (uniqueChars.contains(codePoints[end])) {
                uniqueChars.remove(codePoints[start]);
                start++;
            }
            uniqueChars.add(codePoints[end]);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}