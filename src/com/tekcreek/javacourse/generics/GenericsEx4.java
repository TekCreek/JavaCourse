package com.tekcreek.javacourse.generics;

import java.util.Optional;
import java.util.function.Supplier;

class StackException extends Exception  {
    public StackException(String reason) {
        super(reason);
    }
}

class Stack<T> {
    private T arr[];
    private int top;
    private int limit;

    private static final int DEFAULT_LIMIT = 5;

    public Stack(Supplier<T []> supplier) {
        initialize(supplier);
    }

    private void initialize(Supplier<T []> supplier) {
        arr = supplier.get();
        top = -1;
        limit = arr.length;
    }

    public void push(T ele) throws StackException {
        if (top < limit - 1) {
            arr[++top] = ele;
        } else {
            throw new StackException("overflow");
        }
    }

    public T pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("empty");
        }
        return arr[top--];
    }

    public Optional<T> peek() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(arr[top]);
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class GenericsEx4 {
    public static void main(String[] args) throws StackException {
        Stack<Integer> stk1 = new Stack<Integer>(() -> new Integer[3]);
        stk1.push(10);
        System.out.println(stk1.pop());

        Stack<Double> stk2 = new Stack<Double>( () -> new Double[3] );
        stk2.push(10.2);
        System.out.println( stk2.pop() );
    }
}

