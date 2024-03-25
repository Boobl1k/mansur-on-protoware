package org.example.module6.gc.task3;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferencesExample {

    static byte[] memoryAllocation;

    public static void main(String[] args) throws InterruptedException {
        // Strong reference
        Object strongRef = new byte[12000000];

        // Soft reference
        SoftReference<byte[]> softRef = new SoftReference<>(new byte[12000000]);

        // Weak reference
        WeakReference<byte[]> weakRef = new WeakReference<>(new byte[3000000]);

        // Phantom reference
        ReferenceQueue<byte[]> referenceQueue = new ReferenceQueue<>();
        PhantomReference<byte[]> phantomRef = new PhantomReference<>(new byte[12000000], referenceQueue);

        System.out.println("Strong Reference: " + strongRef);
        System.out.println("Soft Reference: " + softRef.get());
        System.out.println("Weak Reference: " + weakRef.get());
        System.out.println("Phantom Reference: " + phantomRef.get());
        System.out.println();

        // Demonstrating garbage collection behavior
        System.gc(); // Triggering garbage collection

        // Printing the status of the references after garbage collection
        System.out.println("Strong Reference: " + strongRef);
        System.out.println("Soft Reference: " + softRef.get());
        System.out.println("Weak Reference: " + weakRef.get());
        System.out.println("Phantom Reference: " + phantomRef.get());
        System.out.println();

        memoryAllocation = new byte[20000000];
        System.gc();

        Thread.sleep(2000);

        System.out.println("Strong Reference: " + strongRef);
        System.out.println("Soft Reference: " + softRef.get());
        System.out.println("Weak Reference: " + weakRef.get());
        System.out.println("Phantom Reference: " + phantomRef.get());
    }
}
