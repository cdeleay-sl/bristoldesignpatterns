package com.scottlogic.dp.state;

import com.scottlogic.dp.state.ships.FishingShip;

public interface ShipState {
    void startFishing(FishingShip ship);
    void stopFishing(FishingShip ship);
    void dropAnchor(FishingShip ship);
    void raiseAnchor(FishingShip ship);
    void stopSailing(FishingShip ship);
    void startSailing(FishingShip ship);
}
