package com.tekcreek.javacourse.iostreams;

import java.io.*;

class IOUtils {
    public static void copy(OutputStream out, InputStream in) throws IOException {
        byte [] buffer = new byte[1024];
        int n;
        while ( (n = in.read(buffer))  >  0) {
            out.write(buffer, 0, n);
        }
    }
}

public class IOStreamsEx5 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/sagar/Desktop/demo");
        File srcFile = new File(basePath, "src.txt");
        File destFile = new File(basePath, "dest.txt");

//        FileInputStream fileIn = new FileInputStream(srcFile);
//        FileOutputStream fileOut = new FileOutputStream(destFile);
//        try {
//            IOUtils.copy(fileOut, fileIn); // IOException
//            System.out.println("copied...");
//        } finally {
//            fileIn.close();
//            fileOut.close();
//        }


        // try with resource.
        try(FileInputStream fileIn = new FileInputStream(srcFile);
            FileOutputStream fileOut = new FileOutputStream(destFile);) {

            IOUtils.copy(fileOut, fileIn); // IOException
            System.out.println("copied...");
        }
    }
}
