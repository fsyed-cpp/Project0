package com.example.playground;

public class Status {

    // MARK: - Properties

    private int hitPoints;
    private int hunger;
    private int sleepiness;

    // MARK: - Constructors

    public Status(int hitPoints, int hunger, int sleepiness) {

        // Hit Points
        if (hitPoints < 0 ) {
            this.hitPoints = 0;
        } else if (hitPoints > 25) {
            this.hitPoints = 25;
        } else {
            this.hitPoints = hitPoints;
        }

        // Hunger
        if (hunger < 0 ) {
            this.hunger = 0;
        } else if (hitPoints > 15) {
            this.hunger = 15;
        } else {
            this.hunger = hunger;
        }

        // Sleepiness
        if (sleepiness < 0 ) {
            this.sleepiness = 0;
        } else if (hitPoints > 15) {
            this.sleepiness = 15;
        } else {
            this.sleepiness = sleepiness;
        }
    }

    public Status(Status status) {

        // Hit Points
        if (status.hitPoints < 0 ) {
            this.hitPoints = 0;
        } else if (status.hitPoints > 25) {
            this.hitPoints = 25;
        } else {
            this.hitPoints = status.hitPoints;
        }

        // Hunger
        if (status.hunger < 0 ) {
            this.hunger = 0;
        } else if (status.hitPoints > 15) {
            this.hunger = 15;
        } else {
            this.hunger = status.hunger;
        }

        // Sleepiness
        if (status.sleepiness < 0 ) {
            this.sleepiness = 0;
        } else if (status.hitPoints > 15) {
            this.sleepiness = 15;
        } else {
            this.sleepiness = status.sleepiness;
        }
    }

    // MARK: - Getters and Setters

    public int getHitPoints() {
        return hitPoints;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSleepiness() {
        return sleepiness;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0 ) {
            this.hitPoints = 0;
        } else if (hitPoints > 25) {
            this.hitPoints = 25;
        } else {
            this.hitPoints = hitPoints;
        }
    }

    public void setHunger(int hunger) {
        if (hunger < 0 ) {
            this.hunger = 0;
        } else if (hitPoints > 15) {
            this.hunger = 15;
        } else {
            this.hunger = hunger;
        }
    }

    public void setSleepiness(int sleepiness) {
        if (sleepiness < 0 ) {
            this.sleepiness = 0;
        } else if (hitPoints > 15) {
            this.sleepiness = 15;
        } else {
            this.sleepiness = sleepiness;
        }
    }

    // MARK: - Delta Methods

    public void addHitPoints(int delta) {
        int newHitPoints = this.hitPoints + delta;
        if (newHitPoints < 0) {
            newHitPoints = 0;
        } else if (newHitPoints > 25) {
            newHitPoints = 25;
        }
        this.hitPoints = newHitPoints;
    }

    public void addHunger(int delta) {
        int newHunger = this.hunger + delta;
        if (newHunger < 0) {
            newHunger = 0;
        } else if (newHunger > 15) {
            newHunger = 15;
        }
        this.hunger = newHunger;
    }

    public void addSleepiness(int delta) {
        int newSleepiness = this.sleepiness + delta;
        if (newSleepiness < 0) {
            newSleepiness = 0;
        } else if (newSleepiness > 15) {
            newSleepiness = 15;
        }
        this.sleepiness = newSleepiness;
    }

    // MARK: - Utility

    public String toString() {
        return "Hit Points: " +  this.hitPoints + " Hunger: " + this.hunger + " Sleepiness: " + this.sleepiness;
    }

    public boolean equals(Status status) {
        return (this.hitPoints == status.hitPoints &&
                this.hunger == status.hunger &&
                this.sleepiness == status.sleepiness);
    }
}
