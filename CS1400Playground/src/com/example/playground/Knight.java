package com.example.playground;

public class Knight extends Player {

    // MARK: - Constructor

    public Knight(double foodSupply, double waterSupply, double staminaSupply) {
        super(foodSupply, waterSupply, staminaSupply);
    }

    @Override
    public double foodFactor() {
        return 2;
    }

    @Override
    public double waterFactor() {
        return 1.5;
    }

    @Override
    public double staminaFactor() {
        return 3;
    }
}
