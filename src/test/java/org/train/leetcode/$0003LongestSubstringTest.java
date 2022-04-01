package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.$0003LongestSubstring.lengthOfLongestSubstring;
import static org.train.leetcode.$0003LongestSubstring.lengthOfLongestSubstring2;

class $0003LongestSubstringTest {

    @Test
    void test1LengthOfLongestSubstring() {
        assertEquals(3, lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void test2LengthOfLongestSubstring() {
        assertEquals(2, lengthOfLongestSubstring("au"));
    }

    @Test
    void test3LengthOfLongestSubstring() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test4LengthOfLongestSubstring() {
        assertEquals(3, lengthOfLongestSubstring2("pwwkew"));
    }

    @Test
    void test5LengthOfLongestSubstring() {
        assertEquals(2, lengthOfLongestSubstring2("au"));
    }

    @Test
    void test6LengthOfLongestSubstring() {
        assertEquals(3, lengthOfLongestSubstring2("abcabcbb"));
    }
}