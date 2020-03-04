package com.scottlogic.dp.state.ships;

public class WreckedState extends ShipState {

    private String stuck = "Bit stuck here mate, now's not the time.";
    private String notMoving = "We're not moving anyway, there's no point.";

    @Override
    public ShipState startFishing() {
        System.out.println(stuck);
        return this;
    }

    @Override
    public ShipState stopFishing() {
        System.out.println(stuck);
        return this;
    }

    @Override
    public ShipState dropAnchor() {
        System.out.println(notMoving);
        return this;
    }

    @Override
    public  ShipState raiseAnchor() {
        System.out.println(notMoving);
        return this;
    }

    @Override
    public ShipState stopSailing(Engine engine) {
        System.out.println("Still wrecked, can't do much else.");
        return this;
    }

    @Override
    public ShipState startSailing(Engine engine) {
        System.out.println("We're not going anywhere like this.");
        return this;
    }

    @Override
    public ShipState wreck() {
        System.out.println("We're already wrecked it can't get any worse!");
        return this;
    }
}
