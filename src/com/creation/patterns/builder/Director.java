package com.creation.patterns.builder;

public class Director {
    SmartphoneBuilder builder;

    public void setBuilder(SmartphoneBuilder builder) {
        this.builder = builder;
    }

    Smartphone buildSmartphone(){
        builder.createSmartphone();
        builder.buildName();
        builder.buildPrice();
        builder.buldMemory();
        builder.buildModel();

        Smartphone smartphone = builder.getSmartphone();

        return smartphone;
    }


}
