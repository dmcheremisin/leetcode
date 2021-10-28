package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $0014LongestCommonPrefixTest {

    private static final $0014LongestCommonPrefix prefix = new $0014LongestCommonPrefix();

    @Test
    void longestCommonPrefixFl() {
        String result = prefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", result);
    }

    @Test
    void longestCommonPrefixNo() {
        String result = prefix.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", result);
    }

    @Test
    void longestCommonPrefixA() {
        String result = prefix.longestCommonPrefix(new String[]{"ab", "a"});
        assertEquals("a", result);
    }
}
