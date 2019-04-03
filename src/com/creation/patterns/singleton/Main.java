package com.creation.patterns.singleton;

public class Main{
    public static void main(String[] args) {
        MyHome home = MyHome.getInstance();
        System.out.println(home.getRoom());
        home.setRoom(15);
        MyHome home1 = MyHome.getInstance();
        System.out.println(home1.getRoom());
    }
}
