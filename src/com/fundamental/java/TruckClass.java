package com.fundamental.java;

public class TruckClass {
    private String wheelsTexture;
    private int windowsSize;
    private String boxBedType;
    private String colorTexture;

    public TruckClass() {
        System.out.println("Constructor Here");
    }


    public TruckClass(String colorTexture) {
        this("Seamless", 6 , "ToolBox", "Yellow");
        //System.out.println("Truck's Color paint is" + colorTexture);
    }

    public TruckClass(String wheelsTexture, int windowsSize, String boxBedType, String colorTexture) {
        this.setWheelsTexture(wheelsTexture);
        this.setWindowsSize(windowsSize);
        this.setBoxBedType(boxBedType);
        this.setColorTexture(colorTexture);
    }//First printed
    public void Drive() {
        System.out.println("Drivable around country side");

    }//Same as the first printed, having its own "Signiture"
    public void Drive(String message){
        System.out.println(message);
    }

    public String getwheelsTexture() {
        return getWheelsTexture();
    }

    public int getwindowsSize() {
        return getWindowsSize();

    }

    public String getboxBedType() {
        return getBoxBedType();
    }

    public String getColorTexture() {
        return colorTexture;
    }

    public void setwheelsTexture(String wheelsTexture) {
        this.setWheelsTexture(wheelsTexture);
    }

    public void setwindowsSize(int windowsSize) {
        this.setWindowsSize(windowsSize);
    }

    public void setcolorTexture(String colorTexture) {
        this.setColorTexture(colorTexture);
    }

    public String getBoxBedType (String boxBedType) {
        return boxBedType;
    }

         public String getWheelsTexture() {
        return wheelsTexture;
    }

    public void setWheelsTexture(String wheelsTexture) {
        this.wheelsTexture = wheelsTexture;
    }

    public int getWindowsSize() {
        return windowsSize;
    }

    public void setWindowsSize(int windowsSize) {
        this.windowsSize = windowsSize;
    }

    public String getBoxBedType() {
        return boxBedType;
    }

    public void setBoxBedType(String boxBedType) {
        this.boxBedType = boxBedType;
    }

    public void setColorTexture(String colorTexture) {
        this.colorTexture = colorTexture;
    }

}