package com.tekcreek.javacourse.iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * BufferedInputStream & BufferedOutputStream -
 *
 * They decorate the InputStream and OutputStream instances to added
 * buffered I/O functionality.
 *
 */

public class IOStreamsEx6 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("s.dat");
        BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
        bufferOut.write(10);
        bufferOut.write(20);
        bufferOut.flush();
        fileOut.close();
        FileInputStream fileIn = new FileInputStream("s.dat");
        BufferedInputStream bufferIn = new BufferedInputStream(fileIn);
        int a = bufferIn.read();
        int b = bufferIn.read();
        System.out.println(a);
        System.out.println(b);
        fileIn.close();
    }
}
