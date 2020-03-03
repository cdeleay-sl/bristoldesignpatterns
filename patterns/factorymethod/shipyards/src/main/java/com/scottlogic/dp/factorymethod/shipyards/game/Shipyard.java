package com.scottlogic.dp.factorymethod.shipyards.game;

public class Shipyard {
    private int wood = 100;
    private int metal = 100;
    private int cloth = 100;

    private ShipBlueprints blueprints = new FishingShipBlueprints();

    Ship constructShip() {
        MaterialRequirements requirements = blueprints.materialNeeded();
        Material material = prepareMaterial(requirements);

        Ship ship = blueprints.fishingShip(material);
        return ship;
    }

    public String showOffer() {
        return String.format("We can create [%s]", blueprints.shipType());
    }

    public void upgrade() {
        blueprints = new SturdyFishingShipBlueprints();
    }

    private Material prepareMaterial(MaterialRequirements requirements) {
        //fixme: check and update material
        return new Material(5,1,3);
    }

}
