package org.example.module5.java.util.concurrent.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        final int NUM_THREADS = 5;
        final int NUM_ELEMENTS = 1000000;

        System.out.println("Testing ConcurrentHashMap...");
        long startTime = System.currentTimeMillis();
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        Thread[] threads1 = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads1[i] = new Thread(() -> {
                for (int j = 0; j < NUM_ELEMENTS; j++) {
                    concurrentMap.put(j, "Value" + j);
                }
            });
            threads1[i].start();
        }

        for (Thread thread : threads1) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("ConcurrentHashMap Time: " + (endTime - startTime) + "ms");

        System.out.println("\nTesting HashMap...");
        startTime = System.currentTimeMillis();
        Map<Integer, String> hashMap = new HashMap<>();

        Thread[] threads2 = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads2[i] = new Thread(() -> {
                for (int j = 0; j < NUM_ELEMENTS; j++) {
                    synchronized (hashMap) {
                        hashMap.put(j, "Value" + j);
                    }
                }
            });
            threads2[i].start();
        }

        for (Thread thread : threads2) {
            thread.join();
        }

        endTime = System.currentTimeMillis();
        System.out.println("HashMap Time: " + (endTime - startTime) + "ms");
    }
}
