package com.fundamental.java;
//This class serves as an abstract cellphone
public class BlackBerry extends AbstractCellphone {

    public BlackBerry(int Volume, int[] numberKeys, int sendKey, String screen) {
        super(Volume, numberKeys, sendKey, screen);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");

    }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    }
    @Override
    public void endCall () {
        System.out.println("Call has ended");
        }
    }

