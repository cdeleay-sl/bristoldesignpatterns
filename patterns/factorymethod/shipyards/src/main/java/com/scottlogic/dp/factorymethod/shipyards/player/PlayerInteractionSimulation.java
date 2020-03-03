package com.scottlogic.dp.factorymethod.shipyards.player;

import com.scottlogic.dp.factorymethod.shipyards.game.GameMapInterface;
import com.scottlogic.dp.factorymethod.shipyards.game.Shipyard;

public class PlayerInteractionSimulation {

    private GameMapInterface gameMap;

    public PlayerInteractionSimulation(GameMapInterface gameMapInterface) {
        this.gameMap = gameMapInterface;
    }

    /**
     * Simulates what a player would do with the game.
     */
    public void play() {
        Shipyard shipyardA = gameMap.selectShipyard("A");
        System.out.println(shipyardA.showOffer());
        gameMap.upgrade(shipyardA);
        System.out.println(shipyardA.showOffer());
        gameMap.createShip(shipyardA);
        gameMap.createShip(shipyardA);
        gameMap.createShip(shipyardA);
        gameMap.commandFleetToFish();
    }
}
