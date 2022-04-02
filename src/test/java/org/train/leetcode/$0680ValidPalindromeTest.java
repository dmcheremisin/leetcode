package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.$0680ValidPalindrome.validPalindrome;

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