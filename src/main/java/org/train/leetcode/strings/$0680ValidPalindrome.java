package org.train.leetcode.strings;

//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.

public class $0680ValidPalindrome {

    public static boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return validSubPalindrome(start + 1, end, s) || validSubPalindrome(start, end - 1, s);

            start++; end--;
        }
        return true;
    }

    private static boolean validSubPalindrome(int start, int end, String s) {
        while (start < end)
            if (s.charAt(start++) != s.charAt(end--))
                return false;

        return true;
    }

}
