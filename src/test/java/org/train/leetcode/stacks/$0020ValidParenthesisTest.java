package org.train.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.stacks.$0020ValidParenthesis.isValid;

class $0020ValidParenthesisTest {

    @Test
    void isValidTest1() {
        assertTrue(isValid("()"));
    }

    @Test
    void isValidTest2() {
        assertTrue(isValid("()[]{}"));
    }

    @Test
    void isValidTest3() {
        assertFalse(isValid("(]"));
    }
}