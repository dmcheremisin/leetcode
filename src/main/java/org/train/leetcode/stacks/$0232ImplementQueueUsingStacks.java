package org.train.leetcode.stacks;

import java.util.Stack;

//Implement a first in first out (FIFO) queue using only two stacks.
//The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

public class $0232ImplementQueueUsingStacks {

    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (second.isEmpty()) {
            while (!first.isEmpty())
                second.push(first.pop());
        }

        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty())
                second.push(first.pop());
        }

        return second.peek();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}