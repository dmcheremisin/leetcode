package org.train.leetcode.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.stacks.$1249MinimumRemoveToMakeValidParenthesis.minRemoveToMakeValid;

class $1249MinimumRemoveToMakeValidParenthesisTest {

    @Test
    void minRemoveToMakeValidTest1() {
        assertEquals("abc(d)", minRemoveToMakeValid("a)bc(d)"));
    }

    @Test
    void minRemoveToMakeValidTest2() {
        assertEquals("lee(t(c)o)de", minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    @Test
    void minRemoveToMakeValidTest3() {
        assertEquals("", minRemoveToMakeValid("))(("));
    }
}