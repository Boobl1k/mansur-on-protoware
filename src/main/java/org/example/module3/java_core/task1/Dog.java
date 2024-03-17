package org.example.module3.java_core.task1;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        setName(name);
        this.breed = breed;
    }

    @Override
    public String getName() {
        return super.getName() + " (Breed: " + breed + ")";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
