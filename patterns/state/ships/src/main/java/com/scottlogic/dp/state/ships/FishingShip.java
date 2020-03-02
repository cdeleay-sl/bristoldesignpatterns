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
        setState(state.stopSailing(engine));
    }

    public void anchor() {
        setState(state.dropAnchor());
    }

    public void raiseAnchor() {
        setState(state.raiseAnchor());
    }

    public void startFishing() {
        setState(state.startFishing());
    }

    public void stopFishing() {
        setState(state.stopFishing());
    }

    public void sail() {
        setState(state.startSailing(engine));
    }

    public void wreck() {
        setState(state.wreck());
    }
}
