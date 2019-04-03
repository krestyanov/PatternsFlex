package com.creation.patterns.abstractFactory.Samsung;

import com.creation.patterns.abstractFactory.Battery;

public class NiCdBattery implements Battery {
    @Override
    public void typeOfBattery() {
        System.out.println("Samasung Ni-Cd  Battery.");
    }
}
