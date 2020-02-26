package com.scottlogic.dp.state.ships;

public class WreckedState extends ShipState {

    private String stuck = "Bit stuck here mate, now's not the time.";
    private String notMoving = "We're not moving anyway, there's no point.";

    @Override
    public void startFishing(FishingShip ship) {
        System.out.println(stuck);
    }

    @Override
    public void stopFishing(FishingShip ship) {
        System.out.println(stuck);
    }

    @Override
    public void dropAnchor(FishingShip ship) {
        System.out.println(notMoving);
    }

    @Override
    public void raiseAnchor(FishingShip ship) {
        System.out.println(notMoving);
    }

    @Override
    public void stopSailing(FishingShip ship) {
        System.out.println("Still wrecked, can't do much else.");
    }

    @Override
    public void startSailing(FishingShip ship) {
        System.out.println("We're not going anywhere like this.");
    }

    @Override
    public void wreck(FishingShip ship) {
        System.out.println("We're already wrecked it can't get any worse!");
    }
}
