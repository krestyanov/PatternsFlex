package com.creation.patterns.abstractFactory;

import com.creation.patterns.abstractFactory.Samsung.ElementsOfSamsungSmartphone;

public class SamsungS8 {
    public static void main(String[] args) {
        ElementsOfSmartphone elementsOfSmartphone = new ElementsOfSamsungSmartphone();
        Battery battery = elementsOfSmartphone.getBattery();
        Camera camera = elementsOfSmartphone.getCamera();
        Display display = elementsOfSmartphone.getDisplay();

        System.out.println("Samsung S8");
        battery.typeOfBattery();
        camera.typeOfCamera();
        display.typeOfDisplay();
    }
}
