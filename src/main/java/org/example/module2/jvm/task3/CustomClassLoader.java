package org.example.module2.jvm.task3;

import java.io.*;
import java.lang.reflect.Method;

class CustomClassLoader extends ClassLoader {
    private String directoryPath;

    public CustomClassLoader(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = loadClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException("Class not found: " + name);
        }
        return defineClass(name, classData, 0, classData.length);
    }

    private byte[] loadClassData(String className) {
        String filePath = directoryPath + File.separator + className.replace('.', File.separatorChar) + ".class";
        try (InputStream inputStream = new FileInputStream(filePath);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            int bytesRead;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        // Create instances of custom class loader
        CustomClassLoader loader1 = new CustomClassLoader(".\\exercise\\module2\\jvm\\task3");
        CustomClassLoader loader2 = new CustomClassLoader(".\\exercise\\module2\\jvm\\task3");

        // Load class SimpleClass using two different loaders
        Class<?> clazz1 = loader1.loadClass("org.example.module2.jvm.task3.SimpleClass");
        Class<?> clazz2 = loader2.loadClass("org.example.module2.jvm.task3.SimpleClass");

        // Create an instance of SimpleClass using loader1
        Object obj1 = clazz1.newInstance();

        // Create an instance of SimpleClass using loader2
        Object obj2 = clazz2.newInstance();

        // Check that the loaded classes are different
        System.out.println("Are classes equal? " + (clazz1 == clazz2)); // false
        // Check that objects belong to different classes
        System.out.println("Are objects of the same class? " + (obj1.getClass() == obj2.getClass())); // false

        // Вызываем методы объектов
        Method method1 = clazz1.getMethod("sayHello");
        Method method2 = clazz2.getMethod("sayHello");
        method1.invoke(obj1);
        method2.invoke(obj2);
    }
}
