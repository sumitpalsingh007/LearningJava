package com.helloworldconsulting.designPatterns.structural.adapter;

class PortAdapter implements NewPort {
    private OldCharger oldCharger;

    public PortAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithThreePinPlug() {
        System.out.println("Adapter converting three-pin plug to two-pin plug...");
        oldCharger.chargeWithTwoPinPlug();
    }
}