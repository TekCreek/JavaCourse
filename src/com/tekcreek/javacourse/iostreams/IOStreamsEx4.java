package com.tekcreek.javacourse.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream - for reading the content from file.
 *      int read() - reads 1 byte and returns it, -1 if it is EOF.
 *      int read(byte[] buffer) - reads into buffer and returns number of
 *                                bytes read.
 *
 * FileOutputStream - for writing the content to file.
 *      write(int) - writes 1 byte i.e. the last byte of the given value.
 *      write(byte [] buffer) - writes the entire buffer.
 *      write(byte [] buffer, int start, int n) - writes n bytes from the
 *                                                given start index.
 */
public class IOStreamsEx4 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/sagar/Desktop/demo");
        File srcFile = new File(basePath, "src.txt");
        File destFile = new File(basePath, "dest.txt");

        FileInputStream fileIn = new FileInputStream(srcFile);
        FileOutputStream fileOut = new FileOutputStream(destFile);

        byte [] buffer = new byte[1024];
        int n;

        while ( (n = fileIn.read(buffer))  >  0) {
            fileOut.write(buffer, 0, n);
        }

        System.out.println("copied...");

        fileIn.close();
        fileOut.close();
    }
}

/*
src - 1028 bytes

1 - read -> 1024 bytes -> write
2 - read ->    4 bytes ->
 */