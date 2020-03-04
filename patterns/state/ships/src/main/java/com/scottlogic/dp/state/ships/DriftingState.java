package com.scottlogic.dp.state.ships;

class DriftingState extends ShipState {
    @Override
    public ShipState startFishing() {
        System.out.println("Have to anchor first!");
        return this;
    }

    @Override
    ShipState stopFishing() {
        System.out.println("Haven't thrown that net yet, mate.");
        return this;
    }

    @Override
    ShipState dropAnchor() {
        System.out.println("Lowering the anchor! And shields.");
        return new AnchoredState();
    }

    @Override
    ShipState raiseAnchor() {
        System.out.println("The anchor is not set");
        return this;
    }

    @Override
    ShipState startSailing(Engine engine) {
        System.out.println("Sailing!");
        engine.start();
        if (!engine.isOperational()) {
            System.out.println("We're stranded");
            return new StrandedState();
        } else {
            return new SailingState();
        }
    }

    @Override
    ShipState stopSailing(Engine engine) {
        System.out.println("Already still like the wind in summer.");
        return this;
    }

    @Override
    ShipState wreck() {
        System.out.println("Where did that lightening come from?!");
        return new WreckedState();
    }
}
