package org.train.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
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
}
