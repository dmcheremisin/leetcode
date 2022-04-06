package org.train.leetcode.stacks;

import java.util.Deque;
import java.util.LinkedList;

//Given a string s of '(' , ')' and lowercase English characters.
//Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting
//parentheses string is valid and return any valid string.
//Input: s = "lee(t(c)o)de)"
//Output: "lee(t(c)o)de"
//Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
//Input: s = "))(("
//Output: ""
//Explanation: An empty string is also valid.

class $1249MinimumRemoveToMakeValidParenthesis {

    public static String minRemoveToMakeValid(String s) {
        char[] chars = s.toCharArray();

        Deque<Integer> positions = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(')
                positions.push(i);
            else if (chars[i] == ')') {
                if (positions.isEmpty()) {
                    chars[i] = ' ';
                } else {
                    positions.pop();
                }
            }
        }
        while (!positions.isEmpty()) {
            Integer index = positions.pop();
            chars[index] = ' ';
        }

        return new String(chars).replace(" ", "");
    }
}