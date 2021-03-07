package com.tekcreek.javacourse.generics;

import java.util.LinkedList;

class RevisedStack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T ele) {
        list.addFirst(ele);
    }

    public T pop() {
        return list.removeFirst();
    }
}

public class GenericsEx5 {
    public static void main(String[] args) {
        RevisedStack<Integer> s1 = new RevisedStack<>();
        s1.push(10);
        s1.push(20);
        System.out.println( s1.pop() );
        System.out.println( s1.pop() );
    }
}
