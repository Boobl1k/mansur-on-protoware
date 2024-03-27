package org.example.module9.gof_patterns.task1;

import java.util.ArrayList;
import java.util.List;

public class SortingStrategies {
    interface SortingStrategy<T extends Comparable<T>> {
        List<T> sort(List<T> list);
    }

    static class BubbleSort<T extends Comparable<T>> implements SortingStrategy<T> {
        public List<T> sort(List<T> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                        T temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
            return list;
        }
    }

    static class QuickSort<T extends Comparable<T>> implements SortingStrategy<T> {
        public List<T> sort(List<T> list) {
            quickSort(list, 0, list.size() - 1);
            return list;
        }

        private void quickSort(List<T> list, int low, int high) {
            if (low < high) {
                int pi = partition(list, low, high);

                quickSort(list, low, pi - 1);
                quickSort(list, pi + 1, high);
            }
        }

        private int partition(List<T> list, int low, int high) {
            T pivot = list.get(high);
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                if (list.get(j).compareTo(pivot) < 0) {
                    i++;

                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }

            T temp = list.get(i + 1);
            list.set(i + 1, list.get(high));
            list.set(high, temp);

            return i + 1;
        }
    }

    static class Context<T extends Comparable<T>> {
        private SortingStrategy<T> strategy;

        Context(SortingStrategy<T> strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(SortingStrategy<T> strategy) {
            this.strategy = strategy;
        }

        public List<T> sort(List<T> list) {
            return strategy.sort(list);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 9, 1, 5, 6);

        var context = new Context<>(new BubbleSort<Integer>());

        List<Integer> sortedNumbers = context.sort(new ArrayList<>(numbers));
        System.out.println("Bubble Sort: " + sortedNumbers);

        context.setStrategy(new QuickSort<>());
        sortedNumbers = context.sort(new ArrayList<>(numbers));
        System.out.println("Quick Sort: " + sortedNumbers);
    }
}
