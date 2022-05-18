package org.train.leetcode.strings;

import java.util.LinkedList;

//You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters
//from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
//We repeatedly make k duplicate removals on s until we no longer can.
//Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
//Example 1:
//Input: s = "abcd", k = 2
//Output: "abcd"
//Explanation: There's nothing to delete.
//Example 2:
//Input: s = "deeedbbcccbdaa", k = 3
//Output: "aa"
//Explanation:
//First delete "eee" and "ccc", get "ddbbbdaa"
//Then delete "bbb", get "dddaa"
//Finally delete "ddd", get "aa"
//Example 3:
//Input: s = "pbbcggttciiippooaais", k = 2
//Output: "ps"

public class $1209RemoveAllAdjacentDuplicates2 {

    public static String removeDuplicates(String s, int k) {
        int counter = 0;
        char prev = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            sb.append(charAt);
            if (prev == charAt) {
                counter++;
            } else {
                prev = charAt;
                counter = 1;
            }

            if (counter == k) {
                int length = sb.length();
                sb.delete(length - k, length);
                counter = 0;

                if (sb.length() > 0) {
                    int lastIndex = sb.length() - 1;
                    prev = sb.charAt(lastIndex);
                    for(; lastIndex >= 0; lastIndex--) {
                        char next = sb.charAt(lastIndex);
                        if (next == prev) counter++;
                        else break;
                    }
                }
            }
        }

        return sb.toString();
    }
}