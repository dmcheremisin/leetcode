package org.train.leetcode.strings;

public class $0168ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int c = columnNumber;
        while (c >= 26 ) {
            int div = c / 26;
            sb.append((char) (div + 64));
            c = c - div * 26;
        }
        sb.append((char) (c + 64));
        return sb.toString();
    }

}