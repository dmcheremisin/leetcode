package org.train.leetcode.strings;

//Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
//For example:
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...
//Example 1:
//Input: columnTitle = "A"
//Output: 1
//Example 2:
//Input: columnTitle = "AB"
//Output: 28
//Example 3:
//Input: columnTitle = "ZY"
//Output: 701

public class $0171ExcelSheetColumnNumber {

    //"B" = 2
    //"BC" = 2 * 26 + 3
    //"BCM" = 2 * 26 * 26 + 3 * 26 + 13 = (2 * 26 + 3) * 26 + 13
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += (columnTitle.charAt(i) - 64);
        }
        return result;
    }


    public static int titleToNumberPow(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            int c = columnTitle.charAt(i) - 64; // char 'A' == 65
            result += (c * Math.pow(26 , (length - 1 - i)));
        }
        return result;
    }

}