package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.strings.$1209RemoveAllAdjacentDuplicates2.removeDuplicates;

class $1209RemoveAllAdjacentDuplicates2Test {

    @Test
    void removeDuplicatesTest1() {
        assertEquals("aa", removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    void removeDuplicatesTest2() {
        assertEquals("abcd", removeDuplicates("abcd", 2));
    }

    @Test
    void removeDuplicatesTest3() {
        assertEquals("ps", removeDuplicates("pbbcggttciiippooaais", 2));
    }
}