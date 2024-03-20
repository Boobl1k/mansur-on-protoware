package org.example.module4.java_collections.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        // Creating HashMap
        Map<String, String> hashMap = new HashMap<>();
        // Adding elements
        hashMap.put("33", "Peter");
        hashMap.put("11", "John");
        hashMap.put("22", "Maria");

        // Creating TreeMap
        Map<String, String> treeMap = new TreeMap<>();
        // Adding elements
        treeMap.put("33", "Peter");
        treeMap.put("11", "John");
        treeMap.put("22", "Maria");

        // Printing the contents of HashMap
        System.out.println("Contents of HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Printing the contents of TreeMap
        System.out.println("\nContents of TreeMap:");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding duplicate elements
        hashMap.put("11", "John");
        treeMap.put("11", "John");

        // Printing the contents of HashMap after adding duplicate element
        System.out.println("\nContents of HashMap after adding duplicate element:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Printing the contents of TreeMap after adding duplicate element
        System.out.println("\nContents of TreeMap after adding duplicate element:");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
