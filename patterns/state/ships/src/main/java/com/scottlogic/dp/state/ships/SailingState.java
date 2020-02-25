package com.scottlogic.dp.state.ships;

class SailingState implements ShipState {

    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Cannot fishing while sailing, ol' chum.");
    }

    @Override
    public void stopFishing(FishingShip ship) {
        System.out.println("Haven't thrown that net yet, mate.");
    }

    @Override
    public void dropAnchor(FishingShip ship) {
        System.out.println("Cannot anchor sailing boat!");
    }

    @Override
    public void raiseAnchor(FishingShip ship) {
        System.out.println("The anchor is not set");
    }

    @Override
    public void stopSailing(FishingShip ship) {
        System.out.println("Stopping");
        ship.setState(new DriftingState());
    }

    @Override
    public void startSailing(FishingShip ship) {
        System.out.println("Sailing!");
    }

    @Override
    public void wreck(FishingShip ship) {
        System.out.println("Well that rock wasn't there earlier");
        ship.setState(new WreckedState());
    }
}
