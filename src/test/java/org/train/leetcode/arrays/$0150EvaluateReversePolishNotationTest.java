package org.train.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.arrays.$0150EvaluateReversePolishNotation.evalRPN;

class $0150EvaluateReversePolishNotationTest {

    @Test
    void evalRPNTest1() {
        assertEquals(9, evalRPN(new String[]{"2","1","+","3","*"}));
    }

    @Test
    void evalRPNTest2() {
        assertEquals(6, evalRPN(new String[]{"4","13","5","/","+"}));
    }

    @Test
    void evalRPNTest3() {
        assertEquals(22, evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}