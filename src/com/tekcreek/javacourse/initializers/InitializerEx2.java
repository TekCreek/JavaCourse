package com.tekcreek.javacourse.initializers;

import java.util.Properties;

class Config {
    static Properties props;

    static {
        System.out.println("loading the properties from configuration file");
        props = new Properties();
    }
}

class DatabaseDriver {

    static  {
        System.out.println("register with DriverManager....");
    }
}

public class InitializerEx2 {
    public static void main(String[] args) {

    }
}
