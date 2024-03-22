package org.example.module5.java.util.concurrent.task2;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        // Create a CountDownLatch with the number of tasks to be completed
        CountDownLatch latch = new CountDownLatch(3);

        // Create and start threads
        Thread task1 = new Thread(new Task("Task 1", latch));
        Thread task2 = new Thread(new Task("Task 2", latch));
        Thread task3 = new Thread(new Task("Task 3", latch));

        task1.start();
        task2.start();
        task3.start();

        try {
            // Wait for all tasks to complete
            latch.await();
            System.out.println("All tasks completed. Main thread continues execution.");
        } catch (InterruptedException e) {
            System.err.println("Exception while waiting for task completion: " + e.getMessage());
        }
    }

    // Example task that runs in a separate thread
    static class Task implements Runnable {
        private final String name;
        private final CountDownLatch latch;

        Task(String name, CountDownLatch latch) {
            this.name = name;
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println(name + " started execution.");
            // Simulate task execution
            try {
                Thread.sleep((long) (Math.random() * 5000)); // Random delay up to 5 seconds
            } catch (InterruptedException e) {
                System.err.println(name + " was interrupted.");
            }
            System.out.println(name + " completed execution.");
            // Decrease the CountDownLatch counter
            latch.countDown();
        }
    }
}
