package org.train.leetcode.strings;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
// all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

public class $0125ValidPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (c >= 'A' && c <= 'Z')
                    sb.append((char) (c + 32));
                else
                    sb.append(c);
            }
        }

        int start = 0, end = sb.length() - 1;
        while (start < end)
            if (sb.charAt(start++) != sb.charAt(end--))
                return false;

        return true;
    }

    public static boolean isPalindromeRegexp(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int start = 0, end = s.length() - 1;
        while (start < end)
            if (s.charAt(start++) != s.charAt(end--))
                return false;

        return true;
    }

}
