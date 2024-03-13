package org.example.algo.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void testBinarySearchInteger() {
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, BinarySearch.binarySearch(intArray, 7));
    }

    @Test
    public void testBinarySearchString() {
        String[] strArray = {"apple", "banana", "cherry", "grape", "orange"};
        assertEquals(2, BinarySearch.binarySearch(strArray, "cherry"));
    }

    @Test
    public void testBinarySearchIntegerNotFound() {
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, BinarySearch.binarySearch(intArray, 6));
    }

    @Test
    public void testBinarySearchStringNotFound() {
        String[] strArray = {"apple", "banana", "cherry", "grape", "orange"};
        assertEquals(-1, BinarySearch.binarySearch(strArray, "kiwi"));
    }

    @Test
    public void testBinarySearchEmptyArray() {
        Integer[] emptyArray = {};
        assertEquals(-1, BinarySearch.binarySearch(emptyArray, 10));
    }

    @Test
    public void testBinarySearchSingleElementArrayFound() {
        Integer[] singleElementArray = {5};
        assertEquals(0, BinarySearch.binarySearch(singleElementArray, 5));
    }

    @Test
    public void testBinarySearchSingleElementArrayNotFound() {
        Integer[] singleElementArray = {5};
        assertEquals(-1, BinarySearch.binarySearch(singleElementArray, 10));
    }
}
