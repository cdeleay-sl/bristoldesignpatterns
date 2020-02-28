package com.scottlogic.dp.state.ships;

abstract class ShipState {
    abstract void startFishing(FishingShip ship);

    void stopFishing(FishingShip ship) {
        System.out.println("Haven't thrown that net yet, mate.");
    };

    abstract void dropAnchor(FishingShip ship);

    abstract void raiseAnchor(FishingShip ship);

    void stopSailing(FishingShip ship, Engine engine) {
        System.out.println("Already still like the wind in summer.");
    };

    abstract void startSailing(FishingShip ship, Engine engine);

    abstract void wreck(FishingShip ship);
}
