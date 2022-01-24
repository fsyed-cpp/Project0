package com.example.playground;

public class Bird extends Pet {

    public Bird(String name, boolean isHungry, int age) {
        super(name, isHungry, age);
    }

    public void speak() {
        System.out.println("Chirp chirp!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies across the room!");
    }
}
