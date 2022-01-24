package com.example.playground;

import java.util.Arrays;
import java.util.List;

public class SimpleBrain extends Brain {

    // MARK: - Constructor

    public SimpleBrain(Location playerLocation, Player player, Map map) {
        super(playerLocation, player, map);
    }

    // Keeps moving the player down
    @Override
    public boolean movePlayer() {
        if (playerLocation.locationY - 1 >= 0) {
            int newLocY = playerLocation.locationY - 1;
            boolean entered = player.enter(map.terrains[playerLocation.locationX][playerLocation.locationY - 1]);
            if (!entered) {
                System.out.println("Player died going South...");
                return false;
            }
            playerLocation.setLocation(playerLocation.locationX, newLocY);
            return true;
        }
        return false;
    }
}
