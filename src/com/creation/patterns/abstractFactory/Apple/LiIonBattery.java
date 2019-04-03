package com.creation.patterns.abstractFactory.Apple;

import com.creation.patterns.abstractFactory.Battery;

public class LiIonBattery implements Battery {
    @Override
    public void typeOfBattery() {
        System.out.println("Apple Li-ion battery");
    }
}
