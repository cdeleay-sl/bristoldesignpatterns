package com.scottlogic.dp.state.ships;

import com.scottlogic.dp.state.DriftingState;
import com.scottlogic.dp.state.ShipState;

public class FishingShip {
    private ShipState state = new DriftingState();

    public void setState(ShipState state) {
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
}
