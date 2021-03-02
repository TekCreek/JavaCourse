package com.tekcreek.javacourse.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Collections - Prebuilt Data structure implementations.
 *
 * I - Interface
 * C - Class
 *
 *    Collection - (I)
 *       List - (I)
 *         ArrayList - (C)
 *         LinkedList - (C)
 *       Set - (I)
 *         HashSet - (C)
 *         LinkedHashSet (C)
 *         SortedSet - (I)
 *            TreeSet - (C)
 *    Map - (I)
 *      HashMap - (C)
 *      LinkedHashMap - (C)
 *      SortedMap - (I)
 *          TreeMap - (C)
 *
 * Shortcuts -
 *
 *  List - Allows duplicates
 *  Set - No duplicates
 *  Hash - Uses hashing ( insertion order not preserved)
 *  Linked - Insertion order preserved.
 *  Tree - Sorted
 */

// Remove duplicates
public class CollectionsEx4 {
    public static void main(String[] args) {
        int a[] = {30, 10, 20, 40, 10, 20, 10};

        // HashSet<Integer> set1 = new HashSet<Integer>();
        // LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        for (int ele : a) {
            if (! set1.add(ele) ) {
                System.out.println("duplicate found - " + ele);
            }
        }

        // System.out.println( set1 ); // set1.toString()

        // access individual elements of the collections.
        System.out.println("Values in the collection are ");
        for (Integer value: set1) {
            System.out.println( value );
        }

    }
}

