package org.example.module3.java_core.task3;

public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello").intern();

        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // Should be true (string literals may point to the same memory location)
        System.out.println("str1 == str3: " + (str1 == str3)); // Should be false (str1 is a literal, str3 is a new instance)
        System.out.println("str3 == str4: " + (str1 == str4)); // Should be true (str4 interned)

        // Comparing variables using equals()
        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Should be true (content comparison)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // Should be true (content comparison)
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // Should be true (content comparison)
    }
}

/*
The == operator checks if two references point to the same memory location,
while the equals() method checks if the content of the strings is the same.
String literals are pooled in Java, so if two literals have the same value,
they may point to the same memory location, hence the == comparison may return true.
However, when using new keyword, new instances are always created,
so == comparison on new instances returns false, as they are distinct objects.
equals() method compares the actual content of the strings,
so it returns true if the strings have the same sequence of characters.
 */
