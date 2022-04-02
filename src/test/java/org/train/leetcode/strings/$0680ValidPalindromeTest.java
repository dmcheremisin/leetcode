package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.strings.$0680ValidPalindrome.validPalindrome;

class $0680ValidPalindromeTest {

    @Test
    void validPalindromeTest1() {
        assertTrue(validPalindrome("aba"));
    }

    @Test
    void validPalindromeTest2() {
        assertTrue(validPalindrome("abca"));
    }

    @Test
    void validPalindromeTest3() {
        assertFalse(validPalindrome("abc"));
    }
}