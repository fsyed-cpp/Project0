package com.example.playground;

public class Player {

    // MARK: - Properties

    private double foodSupply;
    private double waterSupply;
    private double staminaSupply;

    public int traveledDistance;

    // MARK: - Constructor

    public Player(double foodSupply, double waterSupply, double staminaSupply) {
        this.foodSupply = foodSupply;
        this.waterSupply = waterSupply;
        this.staminaSupply = staminaSupply;

        this.traveledDistance = 0;
    }

    // MARK: - Getters

    public double getFoodSupply() {
        return foodSupply;
    }

    public double getWaterSupply() {
        return waterSupply;
    }

    public double getStaminaSupply() {
        return staminaSupply;
    }

    // MARK: - Setters

    public void setFoodSupply(double foodSupply) {
        this.foodSupply = foodSupply;
    }

    public void setWaterSupply(double waterSupply) {
        this.waterSupply = waterSupply;
    }

    public void setStaminaSupply(double staminaSupply) {
        this.staminaSupply = staminaSupply;
    }

    // MARK: - Stats

    public double foodFactor() {
        return 1;
    }

    public double waterFactor() {
        return 1;
    }

    public double staminaFactor() {
        return 1;
    }

    // MARK: - Functionality

    public boolean enter(Terrain square) {

        // Food
        double food = square.foodCost();
        if (food > 0.0) {
            food *= foodFactor();
        }
        foodSupply -= food;
        if (foodSupply > 20.0) {
            foodSupply = 20.0;
        }
        if (foodSupply < 0.0) {
            return false; // The player has 'died'
        }

        // Water
        double water = square.waterCost();
        if (water > 0.0) {
            water *= waterFactor();
        }
        waterSupply -= water;
        if (waterSupply > 20.0) {
            waterSupply = 20.0;
        }
        if (waterSupply < 0.0) {
            return false; // The player has 'died'
        }

        // Stamina
        double stamina = square.staminaCost();
        if (stamina > 0.0) {
            stamina *= staminaFactor();
        }
        staminaSupply -= stamina;
        if (staminaSupply > 20.0) {
            staminaSupply = 20.0;
        }
        if (staminaSupply < 0.0) {
            return false; // The player has 'died'
        }

        traveledDistance +=1;
        return true;
    }
}
