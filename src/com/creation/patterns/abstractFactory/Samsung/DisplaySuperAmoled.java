package com.creation.patterns.abstractFactory.Samsung;

import com.creation.patterns.abstractFactory.Display;

public class DisplaySuperAmoled implements Display {
    @Override
    public void typeOfDisplay() {
        System.out.println("Samsung SuperAmoled Display.");
    }
}
