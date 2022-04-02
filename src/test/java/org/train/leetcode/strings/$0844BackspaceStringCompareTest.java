package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;
import org.train.leetcode.strings.$0844BackspaceStringCompare;

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