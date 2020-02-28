package com.scottlogic.dp.state.ships;

public class FishingShip {
    private ShipState state = new DriftingState();

    Engine engine = new Engine();

    void setState(ShipState state) {
        this.state = state;
    }

    public ShipState getState() {
        return state;
    }

    public void stop() {
        state.stopSailing(this);
    }

    public void anchor() {
        state.dropAnchor(this);
    }

    public void raiseAnchor() {
        state.raiseAnchor(this);
    }

    public void startFishing() {
        state.startFishing(this);
    }

    public void stopFishing() {
        state.stopFishing(this);
    }

    public void sail() {
        state.startSailing(this);
    }

    public void wreck() {
        state.wreck(this);
    }
}
