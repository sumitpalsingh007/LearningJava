package com.helloworldconsulting.designPatterns.structural.adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        NewPort adapter = new PortAdapter(oldCharger);

        Mobile mobile = new Mobile(adapter);
        mobile.chargeMobile();
    }
}