package com.tekcreek.javacourse.nestedclasses;

import java.io.File;
import java.io.FilenameFilter;

class FileUtils {
    public static void display(File[] files) {
        for(File file: files) {
            System.out.println( file.getName() );
        }
    }
}

public class NestedClassesEx6 {
    public static void main(String[] args) {
        File baseDir = new File("/Users/sagar/Desktop/demo");

//        File[] javaFiles = baseDir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".java");
//            }
//        });

        // Lambda
        File[] javaFiles =
                baseDir.listFiles( (dir, name) -> name.endsWith(".java") );

        FileUtils.display(javaFiles);



    }
}
