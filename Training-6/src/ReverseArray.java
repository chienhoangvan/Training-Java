package com.company;

import java.util.*;

public class ReverseArray<T> {

    private LinkedList<T> stack;


    public ReverseArray() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean inEmpty() {
        if(stack.size() == 0) {
            return true;
        } else return false;
    }
}
