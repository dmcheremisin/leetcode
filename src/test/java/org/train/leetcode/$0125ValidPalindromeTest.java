package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.$0125ValidPalindrome.isPalindrome;
import static org.train.leetcode.$0125ValidPalindrome.isPalindromeRegexp;

class $0125ValidPalindromeTest {

    @Test
    void isPalindromeTest1() {
        assertTrue(isPalindrome("abcbcba"));
    }

    @Test
    void isPalindromeTest2() {
        assertTrue(isPalindrome("ab_a"));
    }

    @Test
    void isPalindromeTest3() {
        assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindromeTest4() {
        assertTrue(isPalindromeRegexp("abcbcba"));
    }

    @Test
    void isPalindromeTest5() {
        assertTrue(isPalindromeRegexp("ab_a"));
    }

    @Test
    void isPalindromeTest6() {
        assertTrue(isPalindromeRegexp("A man, a plan, a canal: Panama"));
    }
}