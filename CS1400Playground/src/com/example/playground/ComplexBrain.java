package com.example.playground;

public class ComplexBrain extends Brain {

    // MARK: - Constructor

    public ComplexBrain(Location playerLocation, Player player, Map map) {
        super(playerLocation, player, map);
    }

    // Analyze the current supplies of the player and
    // the surrounding terrain to see where the player can move
    @Override
    public boolean movePlayer() {

        // North
        if (playerLocation.locationY + 1 < 50) {

            int newLocY = playerLocation.locationY + 1;
            double waterCost = map.terrains[playerLocation.locationX][newLocY].waterCost();
            double foodCost = map.terrains[playerLocation.locationX][newLocY].foodCost();
            double staminaCost = map.terrains[playerLocation.locationX][newLocY].staminaCost();

            if (player.foodFactor() >= foodCost && player.waterFactor() >= waterCost && player.staminaFactor() >= staminaCost) {
                boolean entered = player.enter(map.terrains[playerLocation.locationX][playerLocation.locationY + 1]);
                if (!entered) {
                    System.out.println("Player died going North...");
                    return false;
                }
                playerLocation.setLocation(playerLocation.locationX, playerLocation.locationY + 1);
                return true;
            }
        }

        // East
        if (playerLocation.locationX + 1 < 10) {
            double waterCost = map.terrains[playerLocation.locationX + 1][playerLocation.locationY].waterCost();
            double foodCost = map.terrains[playerLocation.locationX + 1][playerLocation.locationY].foodCost();
            double staminaCost = map.terrains[playerLocation.locationX + 1][playerLocation.locationY].staminaCost();

            if (player.foodFactor() >= foodCost && player.waterFactor() >= waterCost && player.staminaFactor() >= staminaCost) {
                boolean entered = player.enter(map.terrains[playerLocation.locationX + 1][playerLocation.locationY]);
                if (!entered) {
                    System.out.println("Player died going East...");
                    return false;
                }
                playerLocation.setLocation(playerLocation.locationX + 1, playerLocation.locationY);
                return true;
            }
        }

        // South
        if (playerLocation.locationY - 1 >= 0) {
            double waterCost = map.terrains[playerLocation.locationX][playerLocation.locationY - 1].waterCost();
            double foodCost = map.terrains[playerLocation.locationX][playerLocation.locationY - 1].foodCost();
            double staminaCost = map.terrains[playerLocation.locationX][playerLocation.locationY - 1].foodCost();

            if (player.foodFactor() >= foodCost && player.waterFactor() >= waterCost && player.staminaFactor() >= staminaCost) {
                boolean entered = player.enter(map.terrains[playerLocation.locationX][playerLocation.locationY - 1]);
                if (!entered) {
                    System.out.println("Player died going East...");
                    return false;
                }
                playerLocation.setLocation(playerLocation.locationX, playerLocation.locationY - 1);
                return true;
            }
        }

        return false;
    }
}
