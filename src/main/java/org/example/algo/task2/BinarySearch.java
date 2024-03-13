package org.example.algo.task2;

public class BinarySearch {

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = target.compareTo(arr[mid]);

            // Если элемент находится в середине массива
            if (cmp == 0) {
                return mid;
            }

            // Если элемент больше значения в середине, игнорируем левую часть массива
            if (cmp > 0) {
                left = mid + 1;
            }
            // Если элемент меньше значения в середине, игнорируем правую часть массива
            else {
                right = mid - 1;
            }
        }

        // Если элемент не найден, возвращаем -1
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7, 9, 11, 13};
        Integer target = 7;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Элемент " + target + " найден по индексу " + result);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве");
        }
    }
}
