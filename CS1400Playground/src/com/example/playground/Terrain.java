package com.example.playground;

public class Terrain {

    // MARK: - Properties
    protected double foodCost;
    protected double waterCost;
    protected double staminaCost;

    // MARK: - Constructor

    public Terrain(double foodCost, double waterCost, double staminaCost) {
        this.foodCost = foodCost;
        this.waterCost = waterCost;
        this.staminaCost = staminaCost;
    }

    // MARK: - Getters

    public double foodCost() {
        return 1;
    }
    public double waterCost() {
        return 1;
    }
    public double staminaCost() {
        return 1;
    }
}
