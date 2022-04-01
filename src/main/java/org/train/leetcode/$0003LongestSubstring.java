package org.train.leetcode;

import java.util.HashMap;
import java.util.Map;

class $0003LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length <= 1) return length;

        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, currentLongest = 0;
        while(left < length && right < length) {
            while(right < length) {
                Character aChar = s.charAt(right);
                if (!map.containsKey(aChar) || map.get(aChar) < left) {
                    map.put(aChar, right);
                } else {
                    left = map.get(aChar);
                    longest = Math.max(longest, currentLongest);
                    currentLongest = right - left; // {a:0, b:1, c:2, d:3, b:4, e:5} => 4 - 1 = 3
                    map.put(aChar, right);
                    left++; right++;
                    break;
                }
                currentLongest++;
                right++;
            }
        }
        longest = Math.max(longest, currentLongest);

        return longest;
    }

}