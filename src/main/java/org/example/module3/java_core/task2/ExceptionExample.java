package org.example.module3.java_core.task2;

public class ExceptionExample {

    public static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception.");
    }

    public static void throwUncheckedException() {
        throw new RuntimeException("This is an unchecked exception.");
    }

    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            throwUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
