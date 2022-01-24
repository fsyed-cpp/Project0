package com.example.playground;

public class Dog extends Pet {

    public Dog(String name, boolean isHungry, int age) {
        super(name, isHungry, age);
    }

    public void speak() {
        System.out.println("RUFF RUFF!");
    }
}