package com.example.playground;

public class Nomad extends Player {

    // MARK: - Constructor

    public Nomad(double foodSupply, double waterSupply, double staminaSupply) {
        super(foodSupply, waterSupply, staminaSupply);
    }

    @Override
    public double foodFactor() {
        return 1.5;
    }

    @Override
    public double waterFactor() {
        return 1.2;
    }

    @Override
    public double staminaFactor() {
        return 10;
    }
}
