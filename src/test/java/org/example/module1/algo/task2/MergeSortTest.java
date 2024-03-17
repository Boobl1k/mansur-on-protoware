package org.example.module1.algo.task2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] sortedArr = {5, 6, 7, 11, 12, 13};
        MergeSort.mergeSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        MergeSort.mergeSort(arr);
        assertEquals(0, arr.length);
    }

    @Test
    public void testMergeSortSingleElementArray() {
        int[] arr = {5};
        MergeSort.mergeSort(arr);
        assertEquals(1, arr.length);
        assertEquals(5, arr[0]);
    }

    @Test
    public void testMergeSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = {1, 2, 3, 4, 5};
        MergeSort.mergeSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = {1, 2, 3, 4, 5};
        MergeSort.mergeSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortDuplicateElementsArray() {
        int[] arr = {5, 5, 4, 4, 3, 3, 2, 2, 1, 1};
        int[] sortedArr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        MergeSort.mergeSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMergeSortRandom() {
        Random random = new Random();

        for (int test = 0; test < 1000; ++test) {
            int[] arr = new int[100];
            for (int i = 0; i < 100; ++i) {
                arr[i] = random.nextInt();
            }
            int[] expected = Arrays.stream(arr.clone()).sorted().toArray();
            MergeSort.mergeSort(arr);
            assertArrayEquals(expected, arr);
        }
    }
}
