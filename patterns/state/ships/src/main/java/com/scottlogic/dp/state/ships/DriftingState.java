package com.scottlogic.dp.state.ships;

class DriftingState implements ShipState {
    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Have to anchor first!");
    }

    @Override
    public void stopFishing(FishingShip ship) {
        System.out.println("Haven't thrown that net yet, mate.");
    }

    @Override
    public void dropAnchor(FishingShip ship) {
        System.out.println("Lowering the anchor! And shields.");
        ship.setState(new AnchoredState());
    }

    @Override
    public void raiseAnchor(FishingShip ship) {
        System.out.println("The anchor is not set");
    }

    @Override
    public void stopSailing(FishingShip ship) {
        System.out.println("Already still like the wind in summer.");
    }

    @Override
    public void startSailing(FishingShip ship) {
        System.out.println("Sailing!");
        ship.setState(new SailingState());
    }

    @Override
    public void wreck(FishingShip ship) {
        System.out.println("Where did that lightening come from?!");
        ship.setState(new WreckedState());
    }
}
