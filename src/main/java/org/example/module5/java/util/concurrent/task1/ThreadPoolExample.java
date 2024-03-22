package org.example.module5.java.util.concurrent.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 20; i++) {
            executor.submit(new Task("Task " + (i + 1)));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.err.println("Exception was thrown: " + e.getMessage());
        }

        executor.shutdownNow();
    }

    static class Task implements Runnable {
        private final String name;

        Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " started.");
            double sum = 0;
            for (long i = 0L; i < 1000000000L; i++) {
                sum += Math.sqrt(i);
            }
            System.out.println(name + " ended. Result: " + sum);
        }
    }
}
