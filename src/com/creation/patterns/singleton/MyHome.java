package com.creation.patterns.singleton;

public class MyHome {

    private MyHome() {
        System.out.println("Home is created!");
    }

    public static final MyHome INSTANCE = new MyHome();

    public void printName() {
        System.out.println("I am a your  Home!");
    }
}
