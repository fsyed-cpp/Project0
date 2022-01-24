package com.example.playground;

public class Stats {

    // MARK: - Properties

    private int strength;
    private int intelligence;
    private int stamina;

    // MARK: - Constructors

    public Stats(int strength, int intelligence, int stamina) throws IllegalArgumentException {

        // Validate Strength
        if (strength < 1 || strength > 12 ) {
            throw new IllegalArgumentException("Strength must be between 1-12");
        }

        // Validate Intelligence
        if (intelligence < 1 || intelligence > 12 ) {
            throw new IllegalArgumentException("Intelligence must be between 1-12");
        }

        // Validate Stamina
        if (stamina < 1 || stamina > 12 ) {
            throw new IllegalArgumentException("Stamina must be between 1-12");
        }

        // Validate total is 20
        else if (strength + intelligence + stamina != 20) {
            throw new IllegalArgumentException("Error: All skills must add up to 20");
        }

        this.strength = strength;
        this.intelligence = intelligence;
        this.stamina = stamina;
    }

    public Stats(Stats stats) throws Exception {
        if (stats == null) {
            throw new NullPointerException();
        } else if (!stats.skillsAddUpTo20() || !stats.skillsAreInRange()) {
            throw new IllegalArgumentException("Stats must add up to 20 and individually be between 1-12");
        }
        this.strength = stats.strength;
        this.intelligence = stats.intelligence;
        this.stamina = stats.stamina;
    }

    // MARK: - Getters & Setters

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStamina() {
        return stamina;
    }

    // MARK: - Skill Transfers

    public void moveStrengthToIntelligence(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            this.strength += amount;
            this.intelligence -= amount;
            if (!skillsAddUpTo20() || !skillsAreInRange()) {
                // Restore values
                this.strength -= amount;
                this.intelligence += amount;
                throw new IllegalArgumentException("Error: Combined skills cannot exceed 20 and individually must be between 1-12");
            }
        } else {
            this.strength -= amount;
            this.intelligence += amount;
            if (!skillsAddUpTo20() || !skillsAreInRange()) {
                // Restore values
                this.strength += amount;
                this.intelligence -= amount;
                throw new IllegalArgumentException("Error: Combined skills cannot exceed 20 and individually must be between 1-12");
            }
        }
    }

    public void moveIntelligenceToStamina(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            this.intelligence += amount;
            this.stamina -= amount;
            if (!skillsAddUpTo20() || !skillsAreInRange()) {
                // Restore values
                this.intelligence -= amount;
                this.stamina += amount;
                throw new IllegalArgumentException("Error: Combined skills cannot exceed 20 and individually must be between 1-12");
            }
        } else {
            this.intelligence -= amount;
            this.stamina += amount;
            if (!skillsAddUpTo20() || !skillsAreInRange()) {
                // Restore values
                this.intelligence += amount;
                this.stamina -= amount;
                throw new IllegalArgumentException("Error: Combined skills cannot exceed 20 and individually must be between 1-12");
            }
        }
    }

    public void moveStaminaToStrength(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            this.stamina += amount;
            this.strength -= amount;
            if (!skillsAddUpTo20() || !skillsAreInRange()) {
                // Restore values
                this.stamina -= amount;
                this.strength += amount;
                throw new IllegalArgumentException("Error: Combined skills cannot exceed 20 and individually must be between 1-12");
            }
        } else {
            this.stamina -= amount;
            this.strength += amount;
            if (!skillsAddUpTo20() || !skillsAreInRange()) {
                // Restore values
                this.stamina += amount;
                this.strength -= amount;
                throw new IllegalArgumentException("Error: Combined skills cannot exceed 20 and individually must be between 1-12");
            }
        }
    }

    // MARK: - Validation

    private boolean skillsAddUpTo20() {
        return (this.strength + this.intelligence + this.stamina == 20);
    }

    private boolean skillsAreInRange() {
        return (this.strength >= 1 && this.strength <= 12) &&
                (this.intelligence >= 1 && this.intelligence <= 12) &&
                (this.stamina >= 1 && this.stamina <= 12);
    }

    // MARK: - Utility

    public String toString() {
        return "Strength: " +  this.strength + " Intelligence: " + this.intelligence + " Stamina: " + this.strength;
    }

    public boolean equals(Stats stats) {
        return (this.strength == stats.strength &&
                this.intelligence == stats.intelligence &&
                this.stamina == stats.stamina);
    }
}
