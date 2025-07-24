package com.solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

//76. Minimum Window Substring
public class Problem76 {
    public String minWindow(String s, String t) {
        //Validate input
        if (s == null || s.isEmpty() || t == null || t.isEmpty() || s.length() < t.length()) {
            return "";
        }
        // Map to store frequency of each chars in string t
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int minSubStrLength = Integer.MAX_VALUE;
        int wStart = 0;
        int minSubStrStart = 0;
        int requiredTCharCount = 0;
        int totalRequiredTChars = tMap.size();

        // Map to store frequency of each chars in current window of string s
        Map<Character, Integer> wMap = new HashMap<>();

        for (int wEnd = 0; wEnd < s.length(); wEnd++) {
            char wEndChar = s.charAt(wEnd);
            //Put char in window map one by one with count
            wMap.put(wEndChar, wMap.getOrDefault(wEndChar, 0) + 1);

            //If  current character  present in tMap and  its count is equal to its count in wMap, increment the required char counter.
            if (tMap.containsKey(wEndChar) && tMap.get(wEndChar).intValue() == wMap.get(wEndChar).intValue()) {
                requiredTCharCount++;
            }

            while (requiredTCharCount == totalRequiredTChars && wStart <= wEnd) {
                int currWLength = wEnd - wStart + 1;

                if (currWLength < minSubStrLength) {
                    minSubStrLength = currWLength;
                    minSubStrStart = wStart;
                }
                char wStartChar = s.charAt(wStart);

                wMap.put(wStartChar, wMap.get(wStartChar) - 1);

                if (tMap.containsKey(wStartChar) && wMap.get(wStartChar) < tMap.get(wStartChar)) {
                    requiredTCharCount--;
                }
                wStart++;
            }
        }

        if (minSubStrLength == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(minSubStrStart, minSubStrStart + minSubStrLength);
        }
    }
}