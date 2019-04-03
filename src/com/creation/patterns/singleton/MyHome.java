package com.creation.patterns.singleton;

class MyHome{
    private static MyHome myHome = new MyHome();
    private int room;

    private MyHome(){
        this.room = 10;
    }

    public static MyHome getInstance(){
        return myHome;
    }

    public int getRoom(){
        return room;
    }

    public void setRoom(int room){
        this.room = room;
    }
}

