package com.scottlogic.dp.state;

import com.scottlogic.dp.state.ships.FishingShip;

public class Main {
    public static void main(String... args) {
        FishingShip yourBarge = new FishingShip();
        yourBarge.stop();
        yourBarge.sail();
        yourBarge.stop();
        yourBarge.startFishing();
        yourBarge.anchor();
        yourBarge.startFishing();
        yourBarge.stop();
        yourBarge.raiseAnchor();
        yourBarge.stopFishing();
        yourBarge.sail();
        yourBarge.raiseAnchor();
        yourBarge.sail();
        yourBarge.wreck();
    }
}
