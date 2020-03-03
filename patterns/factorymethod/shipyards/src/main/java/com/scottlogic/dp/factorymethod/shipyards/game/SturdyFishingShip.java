package com.scottlogic.dp.factorymethod.shipyards.game;

public class SturdyFishingShip implements Ship {

    private final int MAX_SPEED = 75;
    private State state = State.DRIFTING;

    public int cargoSize() {
        return 40;
    }

    public void goFishing() {
        state = State.FISHING;
        System.out.println("Going fishing");
    }

    public void sail() {
        state = State.SAILING;
    }

    public void stop() {
        state = State.SAILING;
    }

    enum State {
        DRIFTING, FISHING, SAILING
    }
}
