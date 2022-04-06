package org.train.leetcode.stacks;

import java.util.Map;
import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//Input: s = "()[]{}"
//Output: true
//Input: s = "(]"
//Output: false

class $0020ValidParenthesis {

    public static boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '[', ']', '{', '}');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c); // c == [
            } else { // c == ]
                if (stack.isEmpty() || !c.equals(map.get(stack.pop()))) // stack.pop() == "["  ==>  map.get("[")) == ]
                    return false;
            }
        }

        return stack.isEmpty();
    }
}