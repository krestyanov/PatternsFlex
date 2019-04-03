package com.creation.patterns.abstractFactory.Apple;

import com.creation.patterns.abstractFactory.Battery;
import com.creation.patterns.abstractFactory.Camera;
import com.creation.patterns.abstractFactory.Display;
import com.creation.patterns.abstractFactory.ElementsOfSmartphone;

public class ElementsOfAppleSmartphone implements ElementsOfSmartphone {
    @Override
    public Battery getBattery() {
        return new LiIonBattery();
    }

    @Override
    public Camera getCamera() {
        return new Camera10mp();
    }

    @Override
    public Display getDisplay() {
        return new DisplayAmoled();
    }
}
