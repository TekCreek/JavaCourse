package com.tekcreek.javacourse.enums;

enum Color {
    RED("#ff0000"),
    GREEN("#00ff00"),
    BLUE("#0000ff");

    String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

public class EnumEx2 {

    static void print(Color color) {
        System.out.println("Printing the color - " + color);
        System.out.println("Using the code - " + color.getCode());
    }

    public static void main(String[] args) {
        print(Color.RED);

        Color color = Color.valueOf("GREEN");
        print(color);
    }
}
