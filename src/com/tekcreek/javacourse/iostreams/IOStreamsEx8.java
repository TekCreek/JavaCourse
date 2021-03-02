package com.tekcreek.javacourse.iostreams;

import java.io.*;

/**
 * ObjectInputStream and ObjectOutputStream -
 *
 * They decorate the InputStream and OutputStream classes to provide the
 * additional functionality for reading and writing objects.
 *
 * - The corresponding class should implement Serializable interface.
 *
 *  Object ->   jdk     > external machine
 *              JSON
 *              XML
 *  JDK -
 * - Serialization  - converting object to stream of bytes.
 * - Deserialization - converting stream of bytes to object.
 */
public class IOStreamsEx8 {
    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle( 30, 40);

        FileOutputStream fileOut = new FileOutputStream("rectangles.dat");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(r1);
        objOut.writeObject(r2);
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("rectangles.dat");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        Rectangle r3, r4;
        r3 = (Rectangle) objIn.readObject();
        r4 = (Rectangle) objIn.readObject();

        r3.print();
        r4.print();

        fileIn.close();

    }
}
                        // marker interface
class Rectangle implements Serializable {
    private double w, h;
    private transient Double area;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
        this.area = this.w * this.h;
    }

    public double getArea() {
        if (area == null) {
            area = this.w * this.h;
        }
        return area;
    }

    public void print() {
        System.out.println("width - " + w + " , height - " + h + " , area -" + getArea());
    }
}
