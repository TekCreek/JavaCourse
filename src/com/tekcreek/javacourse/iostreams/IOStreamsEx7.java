package com.tekcreek.javacourse.iostreams;

import java.io.*;

/**
 * DataInputStream and DataOutputStream -
 *
 * They decorate the InputStream and OutputStream classes to provide the
 * additional functionality for reading and writing primitive types
 * e.g. int, float, double etc.
 *
 */
public class IOStreamsEx7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("s.dat");
        int a = 9870;
        float b = 10.2f;
        DataOutputStream dout = new DataOutputStream(fileOut);

        dout.writeInt(a);
        dout.writeFloat(b);

        fileOut.close();

        FileInputStream fileIn = new FileInputStream("s.dat");
        DataInputStream din = new DataInputStream( fileIn );

        int x = din.readInt();
        float y = din.readFloat();

        System.out.println(x);
        System.out.println(y);

        fileIn.close();
    }
}
