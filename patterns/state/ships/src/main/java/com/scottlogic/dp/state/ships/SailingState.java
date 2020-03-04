package com.scottlogic.dp.state.ships;

class SailingState extends ShipState {

    @Override
    public ShipState startFishing() {
        System.out.println("Cannot fishing while sailing, ol' chum.");
        return this;
    }

    @Override
    public ShipState stopFishing() {
        System.out.print("Haven't thrown that net yet, mate.");
        return this;
    }

    @Override
    public ShipState dropAnchor() {
        System.out.println("Cannot anchor sailing boat!");
        return this;
    }

    @Override
    public ShipState raiseAnchor() {
        System.out.println("The anchor is not set");
        return this;
    }

    @Override
    public ShipState stopSailing(Engine engine) {
        System.out.println("Stopping");
        engine.stop();
        return new DriftingState();
    }

    @Override
    public ShipState startSailing(Engine engine) {
        System.out.println("Sailing!");
        return this;
    }

    @Override
    public ShipState wreck() {
        System.out.println("Well that rock wasn't there earlier");
        return new WreckedState();
    }
}
