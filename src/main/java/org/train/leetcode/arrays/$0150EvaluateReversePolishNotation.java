package org.train.leetcode.arrays;

import java.util.ArrayDeque;

//Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
//Note that division between two integers should truncate toward zero.
//It is guaranteed that the given RPN expression is always valid.
//That means the expression would always evaluate to a result, and there will not be any division by zero operation.
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
//Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6

public class $0150EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*")) {
                int first = stack.pop();
                int second = stack.pop();
                if (token.equals("+")) stack.push(first + second);
                if (token.equals("-")) stack.push(second - first);
                if (token.equals("*")) stack.push(first * second);
                if (token.equals("/")) stack.push(second / first);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}