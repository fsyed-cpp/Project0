package com.example.playground;

public class Forest extends Terrain {

    public Forest(double foodCost, double waterCost, double staminaCost) {
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
