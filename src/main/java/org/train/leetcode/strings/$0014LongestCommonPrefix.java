package org.train.leetcode.strings;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */
public class $0014LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String firstString = strs[0];
        int i = 0;
        for (; i < firstString.length(); i++) {
            char checkChar = firstString.charAt(i);
            if (!isAllCharsEqualAt(checkChar, i, strs)) {
                break;
            }
        }
        return firstString.substring(0, i);
    }

    private boolean isAllCharsEqualAt(char checkChar, int pos, String[] strs) {
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() <= pos || checkChar != strs[i].charAt(pos)) {
                return false;
            }
        }
        return true;
    }

    public String longestCommonPrefix2(String[] strs) {
        int arrayLength = strs.length;
        String firstString = strs[0];
        if (arrayLength == 1)
            return firstString;

        int minCommonLength = firstString.length();
        for (int i = 1; i < arrayLength; i++)
            minCommonLength = Math.min(minCommonLength, strs[i].length());

        for (int i = 0; i < minCommonLength; i++) {
            char c = firstString.charAt(i);
            for (int j = 1; j < arrayLength; j++) {
                if (c != strs[j].charAt(i))
                    return firstString.substring(0, i);
            }
        }
        return firstString.substring(0, minCommonLength);
    }
}
