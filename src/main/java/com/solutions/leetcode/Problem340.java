package com.solutions.leetcode;


import java.util.HashMap;
import java.util.Map;

//340. Longest Substring with At Most K Distinct Characters
public class Problem340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxLength = 0;
        if (s == null || s.isEmpty() || k == 0) {
            return maxLength;
        }
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            while (map.size() > k) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, (end - start + 1));
        }
        return maxLength;
    }
}