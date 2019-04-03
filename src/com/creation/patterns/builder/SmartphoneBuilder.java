package com.creation.patterns.builder;

public abstract class SmartphoneBuilder {
    Smartphone smartphone;

    void createSmartphone() {
        smartphone = new Smartphone();
    }

    abstract void buildName();

    abstract void buildPrice();

    abstract void buldMemory();

    abstract void buildModel();

    Smartphone getSmartphone() {
        return smartphone;
    }

}

