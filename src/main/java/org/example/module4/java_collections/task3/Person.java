package org.example.module4.java_collections.task3;

import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("Alice", 30));

        System.out.println("before sort:");
        System.out.println(people);

        Collections.sort(people);
        System.out.println("\nsorted by age");
        System.out.println(people);

        Comparator<Person> nameComparator = (person1, person2) -> person1.getName().compareTo(person2.getName());
        people.sort(nameComparator);
        System.out.println("\nsorted by name:");
        System.out.println(people);
    }
}
