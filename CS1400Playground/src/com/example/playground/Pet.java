package com.example.playground;

public class Pet {

    // MARK: - Properties

    private String name;
    private boolean isHungry;
    private int age;

    // MARK: - Constructor

    public Pet(String name, boolean isHungry, int age) {
        this.name = name;
        this.isHungry = isHungry;
        this.age = age;
    }

    // MARK: - Getters

    public String getName() {
        return name;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public int getAge() {
        return age;
    }

    // MARK: - Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // MARK: - Methods

    public void feed() {
        if (isHungry) {
            System.out.println(name + " is now full!");
        } else {
            System.out.println(name + " is not hungry!");
        }
    }

    public void move() {
        System.out.println(name + " runs across the room.");
    }
}

