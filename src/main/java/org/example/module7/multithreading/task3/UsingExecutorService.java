package org.example.module7.multithreading.task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Создаем пул из 3 потоков

        for (int i = 0; i < 20; i++) {
            int parameter = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task " + parameter + " executed by " + Thread.currentThread().getName());
            });
        }

        System.out.println("All tasks started");

        executor.shutdown();

        try {
            executor.submit(() -> {});
        } catch (Exception e) {
            System.out.println("Cannot run tasks in executor anymore. It is shutting down");
        }
    }
}
