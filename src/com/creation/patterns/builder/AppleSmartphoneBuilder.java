package com.creation.patterns.builder;

public class AppleSmartphoneBuilder extends SmartphoneBuilder {
    @Override
    void buildName() {
            smartphone.setName("Apple");
    }

    @Override
    void buildPrice() {
        smartphone.setPrice(500);

    }

    @Override
    void buldMemory() {
        smartphone.setMemory(64);

    }

    @Override
    void buildModel() {
        smartphone.setModel(Model.APPLE);

    }
}
