package com.scottlogic.dp.state.ships;

abstract class ShipState {
    abstract ShipState startFishing();

    abstract ShipState stopFishing();

    abstract ShipState dropAnchor();

    abstract ShipState raiseAnchor();

    abstract ShipState stopSailing(Engine engine);

    abstract ShipState startSailing(Engine engine);

    abstract ShipState wreck();
}
