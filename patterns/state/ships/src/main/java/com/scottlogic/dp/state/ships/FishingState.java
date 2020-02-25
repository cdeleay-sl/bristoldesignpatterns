package com.scottlogic.dp.state.ships;

class FishingState implements ShipState {
    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Fishing 'em ol' fishies.");
    }

    @Override
    public void stopFishing(FishingShip ship) {
        System.out.println("Stop fishing");
        ship.setState(new AnchoredState());
    }

    @Override
    public void dropAnchor(FishingShip ship) {
        System.out.println("Already anchored");
    }

    @Override
    public void raiseAnchor(FishingShip ship) {
        System.out.println("Don't sail yet, this one is a biggie!");
    }

    @Override
    public void startSailing(FishingShip ship) {
        System.out.println("Me cannot move this barge 'til we raise the anchor");
    }

    @Override
    public void stopSailing(FishingShip ship) {
        System.out.println("Already still like the wind in summer.");
    }
}
