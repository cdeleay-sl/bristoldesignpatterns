package com.scottlogic.dp.factorymethod.shipyards.game;

public class SturdyFishingShipBlueprints implements ShipBlueprints{
    public SturdyFishingShip fishingShip(Material material) {
        if(isMaterialSatisfactory(material)) {
            return new SturdyFishingShip();
        } else {
            throw new IllegalArgumentException("Insufficient material");
        }
    }

    public MaterialRequirements materialNeeded() {
        return new MaterialRequirements(50, 1, 2);
    }

    public String shipType() {
        return "Sturdy fishing barge";
    }

    private boolean isMaterialSatisfactory(Material material) {
        //Shorthand - always is.
        //Fixme: Implement
        return true;
    }
}
