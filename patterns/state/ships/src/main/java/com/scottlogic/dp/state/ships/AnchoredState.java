package com.scottlogic.dp.state.ships;

class AnchoredState extends ShipState {

    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Fishing 'em ol' fishies.");
        ship.setState(new FishingState());
    }

    @Override
    public void dropAnchor(FishingShip ship) {
        System.out.println("Already anchored");
    }

    @Override
    public void raiseAnchor(FishingShip ship) {
        System.out.println("Now raising anchor.");
        ship.setState(new DriftingState());
    }

    @Override
    public void startSailing(FishingShip ship, Engine engine) {
        System.out.println("Me cannot move this barge 'til we raise the anchor");
    }

    @Override
    public void wreck(FishingShip ship) {
        System.out.println("Where did that lightening come from?!");
        ship.setState(new WreckedState());
    }
}
