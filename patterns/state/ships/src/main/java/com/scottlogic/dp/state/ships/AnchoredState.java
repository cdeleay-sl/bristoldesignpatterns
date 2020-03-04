package com.scottlogic.dp.state.ships;

class AnchoredState extends ShipState {

    @Override
    public ShipState startFishing() {
        System.out.println("Fishing 'em ol' fishies.");
        return new FishingState();
    }

    @Override
    public ShipState stopFishing() {
        System.out.println("Haven't thrown that net yet, mate.");
        return this;
    }

    @Override
    public ShipState dropAnchor() {
        System.out.println("Already anchored");
        return this;
    }

    @Override
    public ShipState raiseAnchor() {
        System.out.println("Now raising anchor.");
        return new DriftingState();
    }

    @Override
    public ShipState startSailing(Engine engine) {
        System.out.println("Me cannot move this barge 'til we raise the anchor");
        return this;
    }

    @Override
    public ShipState stopSailing(Engine engine) {
        System.out.println("Already still like the wind in summer.");
        return this;
    }

    @Override
    public ShipState wreck() {
        System.out.println("Where did that lightening come from?!");
        return new WreckedState();
    }
}
