package com.helloworldconsulting.designPatterns.structural.adapter;

class Mobile {
    private NewPort charger;

    public Mobile(NewPort charger) {
        this.charger = charger;
    }

    public void chargeMobile() {
        charger.chargeWithThreePinPlug();
    }
}