package com.scottlogic.dp.state.ships;

public class StrandedState extends ShipState {

    private String stuck = "Jolly joy, this old barge ain't going nowhere";

    @Override
    ShipState startFishing() {
        System.out.println(stuck);
        return this;
    }

    @Override
    ShipState stopFishing() {
        System.out.println(stuck);
        return this;
    }

    @Override
    ShipState dropAnchor() {
        System.out.println(stuck);
        return this;
    }

    @Override
    ShipState raiseAnchor() {
        System.out.println(stuck);
        return this;
    }

    @Override
    ShipState startSailing(Engine engine) {
        System.out.println(stuck);
        return this;
    }

    @Override
    ShipState stopSailing(Engine engine) {
        System.out.println(stuck);
        return this;
    }

    @Override
    ShipState wreck() {
        System.out.println("We're already stranded it can't get any worse!");
        return this;
    }

}
