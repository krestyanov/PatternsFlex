package com.creation.patterns.abstractFactory;

import com.creation.patterns.abstractFactory.Apple.ElementsOfAppleSmartphone;

public class Iphone7 {
    public static void main(String[] args) {
        ElementsOfSmartphone elementsOfSmartphone = new ElementsOfAppleSmartphone();
        Battery battery = elementsOfSmartphone.getBattery();
        Camera camera = elementsOfSmartphone.getCamera();
        Display display = elementsOfSmartphone.getDisplay();

        System.out.println("Apple Iphone 7");
        battery.typeOfBattery();
        camera.typeOfCamera();
        display.typeOfDisplay();

    }
}
