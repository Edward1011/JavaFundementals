package com.fundamental.java;

public class House implements MyFirstInterface{
    private String roofType;
    private int windowType;
    private String doorColor;
    private String foundation;

    public House() {
        System.out.println("This is the default constructor");
    }
    public House(String doorColor) {
        this("Orange",24, "concrete", "Flat");
        System.out.println("The Door Color is " + doorColor);
    }

    public House (String doorColor, int windowType, String foundation, String roofType) {
    this.setDoorColor(doorColor);
    this.setWindowType(windowType);
    this.setFoundation(foundation);
    this.roofType = roofType;
        this.roofType = roofType;
    }

//getter
    public String getroofType() { //Getter
        return roofType;
    }
    //setter
    public void setroofType(String roofType) { //Setter
        this.roofType = roofType;
    }
//Our first method(Function)
    public void doorOpenClose(){
        System.out.println("Open my door");
    }

    public void doorOpenClose(String message) {
        System.out.println(message);
    }

    public int getWindowType() {
        return windowType;
    }

    public void setWindowType(int windowType) {
        this.windowType = windowType;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

   @Override
    public void endCall(){

    }
}