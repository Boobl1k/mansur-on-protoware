package org.example.module7.multithreading.task1;

public class CreatingThreadsExample {
    static class ExtendedThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("ExtendedThread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class RunnableTask implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("RunnableTask is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ExtendedThread thread1 = new ExtendedThread();
        ExtendedThread thread2 = new ExtendedThread();
        thread1.start();
        thread2.start();

        RunnableTask task1 = new RunnableTask();
        RunnableTask task2 = new RunnableTask();
        Thread thread3 = new Thread(task1);
        Thread thread4 = new Thread(task2);
        thread3.start();
        thread4.start();

        System.out.println("Continuing executing method main");
        System.out.println("All threads started");

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("All threads ended");

        ExtendedThread thread5 = new ExtendedThread();

        System.out.println("Calling run()");
        thread5.run();
        System.out.println("Continuing executing method main");

    }
}
