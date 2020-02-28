package com.scottlogic.dp.state.ships;

class SailingState extends ShipState {

    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Cannot fishing while sailing, ol' chum.");
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
    public void stopSailing(FishingShip ship, Engine engine) {
        System.out.println("Stopping");
        ship.setState(new DriftingState());
        engine.stop();
    }

    @Override
    public void startSailing(FishingShip ship, Engine engine) {
        System.out.println("Sailing!");
    }

    @Override
    public void wreck(FishingShip ship) {
        System.out.println("Well that rock wasn't there earlier");
        ship.setState(new WreckedState());
    }
}
