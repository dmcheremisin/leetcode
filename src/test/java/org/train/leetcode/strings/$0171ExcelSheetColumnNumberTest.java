package org.train.leetcode.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.train.leetcode.strings.$0171ExcelSheetColumnNumber.titleToNumber;

class $0171ExcelSheetColumnNumberTest {

    @Test
    void convertToTitleTest1() {
        assertEquals(1, titleToNumber("A"));
    }

    @Test
    void convertToTitleTest2() {
        assertEquals(28, titleToNumber("AB"));
    }

    @Test
    void convertToTitleTest3() {
        assertEquals(701, titleToNumber("ZY"));
    }

    @Test
    void convertToTitleTest4() {
        assertEquals(2147483647, titleToNumber("FXSHRXW"));
    }

    @Test
    void convertToTitleTest5() {
        assertEquals(52, titleToNumber("AZ"));
    }

    @Test
    void convertToTitleTest6() {
        assertEquals(27, titleToNumber("AA"));
    }
}