package org.train.leetcode.stacks;

import java.util.Stack;

//Implement a first in first out (FIFO) queue using only two stacks.
//The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

public class $0232ImplementQueueUsingStacks {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty())
                out.push(in.pop());
        }

        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty())
                out.push(in.pop());
        }

        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}