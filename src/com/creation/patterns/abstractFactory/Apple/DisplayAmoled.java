package com.creation.patterns.abstractFactory.Apple;

import com.creation.patterns.abstractFactory.Display;

public class DisplayAmoled implements Display {


    @Override
    public void typeOfDisplay() {
        System.out.println("Apple Amoled Display.");
    }
}
