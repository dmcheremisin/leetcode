package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.train.leetcode.strings.$1047RemoveAllAdjacentDuplicates.removeDuplicates;

class $1047RemoveAllAdjacentDuplicatesTest {

    @Test
    void removeDuplicatesTest1() {
        assertEquals("ca", removeDuplicates("abbaca"));
    }

    @Test
    void removeDuplicatesTest2() {
        assertEquals("ay", removeDuplicates("azxxzy"));
    }

}