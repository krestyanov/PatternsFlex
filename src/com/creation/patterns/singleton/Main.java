package com.creation.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        MyHome.INSTANCE.printName();

        System.out.println(MyHome.INSTANCE.getClass());
    }
}

