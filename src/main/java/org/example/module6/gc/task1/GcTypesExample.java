package org.example.module6.gc.task1;

public class GcTypesExample {
    public static void main(String[] args) {
        long totalIterations = 0;
        long startTime = System.currentTimeMillis();

        String string = "";
        while (true) {
            string += "aaaaaaaaaaaaaaaaaa";
            if (string.length() > 100) {
                string = "";
            }
            ++totalIterations;
            final var currentTime = System.currentTimeMillis();
            if (currentTime - startTime >= 10000) {
                double iterationsPerSecond = (double) totalIterations / 10.0;
                System.out.println("Average iterations per second: " + iterationsPerSecond);

                // Обнуляем переменные
                totalIterations = 0;
                startTime = currentTime;
            }
        }
    }
}
