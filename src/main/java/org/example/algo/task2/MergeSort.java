package org.example.algo.task2;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Массив уже отсортирован или пустой
        }

        int[] helper = new int[arr.length]; // Вспомогательный массив для слияния

        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle); // Сортировка левой половины
            mergeSort(arr, helper, middle + 1, high); // Сортировка правой половины
            merge(arr, helper, low, middle, high); // Слияние двух отсортированных половин
        }
    }

    private static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        // Копируем элементы из исходного массива во вспомогательный массив
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int leftIndex = low;
        int rightIndex = middle + 1;
        int resultIndex = low;

        // Слияние двух половин
        while (leftIndex <= middle && rightIndex <= high) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                arr[resultIndex] = helper[leftIndex];
                leftIndex++;
            } else {
                arr[resultIndex] = helper[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        // Копируем оставшиеся элементы из левой половины (если остались)
        while (leftIndex <= middle) {
            arr[resultIndex] = helper[leftIndex];
            resultIndex++;
            leftIndex++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 11, 5, 6, 7};
        System.out.println("Исходный массив:");
        printArray(arr);
        mergeSort(arr);
        System.out.println("\nМассив после сортировки слиянием:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
