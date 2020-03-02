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
        state.stopSailing(engine);
    }

    public void anchor() {
        state.dropAnchor();
    }

    public void raiseAnchor() {
        state.raiseAnchor();
    }

    public void startFishing() {
        state.startFishing();
    }

    public void stopFishing() {
        state = state.stopFishing();
    }

    public void sail() {
        state = state.startSailing(engine);
    }

    public void wreck() {
        state = state.wreck();
    }
}
