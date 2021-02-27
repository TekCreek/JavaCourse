package com.tekcreek.javacourse.iostreams;

import java.io.File;
import java.io.IOException;

/**
 * File class - Allows us to access the metadata of the file or directory.
 * e.g. File f = new File("a.txt");
 *      int len = f.length();
 */

public class IOStreamsEx1 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/sagar/Desktop/demo");
        System.out.println("isDirectory - " + basePath.isDirectory());

        File f = new File(basePath, "a.txt");
        f.createNewFile();
        System.out.println(f.getName() + "- length : " + f.length() );

        File f2 = new File(basePath, "b.txt");
        if (f2.isFile()) {
            System.out.println(f2.getName() + " exists ");
        } else {
            System.out.println(f2.getName() + " doesnot exist ");
        }
    }
}
