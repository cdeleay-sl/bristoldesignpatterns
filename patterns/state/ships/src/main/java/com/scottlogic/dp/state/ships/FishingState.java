package com.scottlogic.dp.state.ships;

class FishingState extends ShipState {

    @Override
    public ShipState startFishing() {
        System.out.println("Fishing 'em ol' fishies.");
        return this;
    }

    @Override
    public ShipState stopFishing() {
        System.out.println("Stop fishing");
        return new AnchoredState();
    }

    @Override
    public ShipState dropAnchor() {
        System.out.println("Already anchored");
        return this;
    }

    @Override
    public ShipState raiseAnchor() {
        System.out.println("Don't sail yet, this one is a biggie!");
        return this;
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
        System.out.println("This fish is a little bigger than expected");
        return new WreckedState();
    }
}
