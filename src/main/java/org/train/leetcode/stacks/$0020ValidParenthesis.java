package org.train.leetcode.stacks;

import java.util.Map;
import java.util.Stack;

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