package com.example.playground;

public class River extends Terrain {

    public River(double foodCost, double waterCost, double staminaCost) {
        super(foodCost, waterCost, staminaCost);
    }

    @Override
    public double foodCost() {
        return this.foodCost;
    }

    @Override
    public double waterCost() {
        return this.waterCost;
    }

    @Override
    public double staminaCost() {
        return this.staminaCost;
    }
}

