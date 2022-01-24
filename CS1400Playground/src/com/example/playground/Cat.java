package com.example.playground;

public class Cat extends Pet {

    public Cat(String name, boolean isHungry, int age) {
        super(name, isHungry, age);
    }

    public void speak() {
        System.out.println("Meow!");
    }
}
