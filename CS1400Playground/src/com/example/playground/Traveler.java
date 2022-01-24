package com.example.playground;

public class Traveler extends Player {

    // MARK: - Constructor

    public Traveler(double foodSupply, double waterSupply, double staminaSupply) {
        super(foodSupply, waterSupply, staminaSupply);
    }

    @Override
    public double foodFactor() {
        return 5;
    }

    @Override
    public double waterFactor() {
        return 3;
    }

    @Override
    public double staminaFactor() {
        return 7;
    }
}
