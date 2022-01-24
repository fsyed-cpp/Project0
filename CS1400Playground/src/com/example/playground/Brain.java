package com.example.playground;

public class Brain {

    // MARK: - Properties

    public Location playerLocation;
    public Player player;
    public Map map;

    // MARK: - Constructor

    public Brain(Location playerLocation, Player player, Map map) {
        this.playerLocation = playerLocation;
        this.player = player;
        this.map = map;
    }

    // MARK: - Functionality

    // Pre-fetch the new move to see if it's viable
    public Location prefetchNextLocation() {
        return new Location(playerLocation.locationX + 1, playerLocation.locationY);
    }

    // By default, the base Brain moves the player 1 square east
    public boolean movePlayer() {
        if (map.terrains[playerLocation.locationX + 1][playerLocation.locationY] != null) {
            int newLocX = playerLocation.locationX + 1;
            playerLocation.setLocation(newLocX, playerLocation.locationY);
            return true;
        }
        return false;
    }
}
