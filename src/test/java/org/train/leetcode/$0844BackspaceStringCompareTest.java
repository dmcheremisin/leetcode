package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class $0844BackspaceStringCompareTest {

    @Test
    void backspaceCompare() {
        assertTrue($0844BackspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue($0844BackspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertFalse($0844BackspaceStringCompare.backspaceCompare("bxj##tw", "bxj###tw"));
    }
}