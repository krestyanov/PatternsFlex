package com.creation.patterns.builder;

public class SamsungSmartphoneBuilder extends SmartphoneBuilder {

    @Override
    void buildName() {
        smartphone.setName("Samsung");
    }

    @Override
    void buildPrice() {
        smartphone.setPrice(1000);

    }

    @Override
    void buldMemory() {
        smartphone.setMemory(128);

    }

    @Override
    void buildModel() {
        smartphone.setModel(Model.SAMSUNG);

    }
}
