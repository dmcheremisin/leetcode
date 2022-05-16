package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.train.leetcode.strings.$0168ExcelSheetColumnTitle.convertToTitle;

class $0168ExcelSheetColumnTitleTest {

    @Test
    void convertToTitleTest1() {
        assertEquals("A", convertToTitle(1));
    }

    @Test
    void convertToTitleTest2() {
        assertEquals("AB", convertToTitle(28));
    }

    @Test
    void convertToTitleTest3() {
        assertEquals("ZY", convertToTitle(701));
    }

    @Test
    void convertToTitleTest4() {
        assertEquals("FXSHRXW", convertToTitle(2147483647));
    }

    @Test
    void convertToTitleTest5() {
        assertEquals("AZ", convertToTitle(52));
    }
}