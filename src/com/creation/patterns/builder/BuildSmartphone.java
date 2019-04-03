package com.creation.patterns.builder;

public class BuildSmartphone {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new SamsungSmartphoneBuilder());
        Smartphone smartphone = director.buildSmartphone();

        System.out.println(smartphone);
    }
}
