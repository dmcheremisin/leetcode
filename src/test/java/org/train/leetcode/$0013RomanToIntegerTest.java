package org.train.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class $0013RomanToIntegerTest {

    private static final $0013RomanToInteger rti = new $0013RomanToInteger();

    @Test
    public void romanToIntIII() {
        assertEquals(3, rti.romanToInt("III"));
    }

    @Test
    public void romanToIntIV() {
        assertEquals(4, rti.romanToInt("IV"));
    }

    @Test
    public void romanToIntIX() {
        assertEquals(9, rti.romanToInt("IX"));
    }

    @Test
    public void romanToIntLVIII() {
        assertEquals(58, rti.romanToInt("LVIII"));
    }

    @Test
    public void romanToIntMCMXCIV() {
        assertEquals(1994, rti.romanToInt("MCMXCIV"));
    }
}
