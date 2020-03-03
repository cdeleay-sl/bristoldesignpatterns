package com.scottlogic.dp.factorymethod.shipyards.game;

public interface ShipBlueprints {
    Ship fishingShip(Material material);

    MaterialRequirements materialNeeded();

    String shipType();

}
