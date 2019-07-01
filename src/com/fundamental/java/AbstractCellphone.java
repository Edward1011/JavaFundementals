package com.fundamental.java;
//This lab demostrates an abstract Class

public abstract class AbstractCellphone implements MyFirstInterface {
    private int volume;
    private int[] numberKeys;
    private int sendKey;
    private String screen;

    public AbstractCellphone(int Volume, int[] numberKeys, int sendKey, String screen) {
        this.numberKeys = numberKeys;
        this.screen = screen;
        this.sendKey = sendKey;
        this.volume = getVolume();
    }// end of constructor

    public abstract void receiveCall();

    public abstract void sendCall();

    public abstract  void EndCall();

    public int getVolume() {
        return volume;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }


    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;
    }
}
