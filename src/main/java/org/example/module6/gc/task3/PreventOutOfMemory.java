package org.example.module6.gc.task3;

import java.lang.ref.*;
import java.util.ArrayList;
import java.util.List;


public class PreventOutOfMemory {
    public static void main(String[] args) {
        int iterations = 10;

        System.out.println("Generating objects with soft references");
        List<SoftReference<byte[]>> softReferences = new ArrayList<>();

        try {
            for (int i = 0; i < iterations; ++i) {
                byte[] data = new byte[1000000000];
                SoftReference<byte[]> softReference = new SoftReference<>(data);
                softReferences.add(softReference);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred while using soft references.");
            throw e;
        }
        softReferences = null;
        System.out.println("Soft references are deleted");


        System.out.println("Generating objects with soft references");
        List<byte[]> strongReferences = new ArrayList<>();

        try {
            for (int i = 0; i < iterations; ++i) {
                byte[] data = new byte[1000000000];
                byte[] strongReference = data;
                strongReferences.add(strongReference);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred while using strong references.");
            throw e;
        }
        strongReferences = null;
        System.out.println("Strong references are deleted");
    }
}
