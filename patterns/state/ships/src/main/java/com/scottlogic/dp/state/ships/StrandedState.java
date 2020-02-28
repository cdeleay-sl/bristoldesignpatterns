package com.scottlogic.dp.state.ships;

public class StrandedState extends ShipState{

    private String stuck = "Jolly joy, this old barge ain't going nowhere";

    @Override
    void startFishing(FishingShip ship) {
        System.out.println(stuck);
    }

    void stopFishing(FishingShip ship) {
        System.out.println(stuck);
    };

    @Override
    void dropAnchor(FishingShip ship) {
        System.out.println(stuck);
    }

    @Override
    void raiseAnchor(FishingShip ship) {
        System.out.println(stuck);
    }

    @Override
    void startSailing(FishingShip ship) {
        System.out.println(stuck);
    }

    @Override
    void wreck(FishingShip ship) {
        System.out.println("We're already stranded it can't get any worse!");
    }

    @Override
    void stopSailing(FishingShip ship) {
        System.out.println(stuck);
    }
}
