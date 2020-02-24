package com.scottlogic.dp.state;

import com.scottlogic.dp.state.ships.FishingShip;

public class AnchoredState implements ShipState {

    @Override
    public void startFishing(FishingShip ship) {
        System.out.println("Fishing 'em ol' fishies.");
        ship.setState(new FishingState());
    }

    @Override
    public void stopFishing(FishingShip ship) {
        System.out.println("Haven't thrown that net yet, mate.");
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
    public void stopSailing(FishingShip ship) {
        System.out.println("Already still like the wind in summer.");
    }

    @Override
    public void startSailing(FishingShip ship) {
        System.out.println("Me cannot move this barge 'til we raise the anchor");
    }
}
