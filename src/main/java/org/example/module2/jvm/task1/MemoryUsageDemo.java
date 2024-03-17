package org.example.module2.jvm.task1;

import java.util.ArrayList;

class MemoryUsageDemo {
    private static Runtime runtime = Runtime.getRuntime();

    public static void main(String[] args) {

        System.out.println("Initial Memory:");
        printMemoryStats();

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) {
            arrayList.add(String.valueOf(i));
        }

        System.out.println("Memory after creating ArrayList:");
        printMemoryStats();

        String[] stringArray = new String[5000000];
        for (int i = 0; i < 5000000; i++) {
            stringArray[i] = String.valueOf(i);
        }

        System.out.println("Memory after creating array:");
        printMemoryStats();

        // optional, GC will collect them anyway
        arrayList = null;
        stringArray = null;

        runtime.gc();

        System.out.println("Memory after clearing and garbage collection:");
        printMemoryStats();
    }

    private static void printMemoryStats() {
        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
        System.out.println("---------------------------");
    }
}
