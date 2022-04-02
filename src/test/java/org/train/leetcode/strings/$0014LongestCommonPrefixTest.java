package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;
import org.train.leetcode.strings.$0014LongestCommonPrefix;

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

    @Test
    void longestCommonPrefixFl2() {
        String result = prefix.longestCommonPrefix2(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", result);
    }

    @Test
    void longestCommonPrefixNo2() {
        String result = prefix.longestCommonPrefix2(new String[]{"dog","racecar","car"});
        assertEquals("", result);
    }

    @Test
    void longestCommonPrefixA2() {
        String result = prefix.longestCommonPrefix2(new String[]{"ab", "a"});
        assertEquals("a", result);
    }
}
