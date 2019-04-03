package com.creation.patterns.abstractFactory.Samsung;

import com.creation.patterns.abstractFactory.Battery;
import com.creation.patterns.abstractFactory.Camera;
import com.creation.patterns.abstractFactory.Display;
import com.creation.patterns.abstractFactory.ElementsOfSmartphone;

public class ElementsOfSamsungSmartphone implements ElementsOfSmartphone {
    @Override
    public Battery getBattery() {
        return new NiCdBattery();
    }

    @Override
    public Camera getCamera() {
        return new Camera20mp();
    }

    @Override
    public Display getDisplay() {
        return new DisplaySuperAmoled() ;
    }
}
