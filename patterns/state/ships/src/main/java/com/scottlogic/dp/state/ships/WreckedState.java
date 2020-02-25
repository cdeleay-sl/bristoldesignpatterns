package com.scottlogic.dp.state.ships;

public class WreckedState implements ShipState {

    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Bit stuck here mate, we're now's not the time.");
    }

    @Override
    public void stopFishing(FishingShip ship) {
        System.out.println("Bit stuck here mate, we're now's not the time.");
    }

    @Override
    public void dropAnchor(FishingShip ship) {
        System.out.println("We're not moving anyway, there's no point.");
    }

    @Override
    public void raiseAnchor(FishingShip ship) {
        System.out.println("We're not moving anyway, there's no point.");
    }

    @Override
    public void stopSailing(FishingShip ship) {
        System.out.println("Still wrecked, can't do much else.");
    }

    @Override
    public void startSailing(FishingShip ship) {
        System.out.println("We're not going anywhere like this.");
    }

    @Override
    public void wreck(FishingShip ship) {
        System.out.println("We're already wrecked it can't get any worse!");
    }
}
