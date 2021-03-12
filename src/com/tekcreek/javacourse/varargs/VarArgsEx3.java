package com.tekcreek.javacourse.varargs;

import java.util.ArrayList;
import java.util.Collection;

public class VarArgsEx3 {
    public static void main(String[] args) {
        Collection<String> col1 = MyCollection.of("a", "b", "cd");
        System.out.println( col1 );

        Collection<Integer> col2 = MyCollection.of(10, 20, 3, 4);
        System.out.println( col2 );
    }
}


class MyCollection {

    public static <T> Collection<T> of(T ... values) {
        Collection<T> col = new ArrayList<>();
        for (T value : values) {
            col.add(value);
        }
        return col;
    }
}