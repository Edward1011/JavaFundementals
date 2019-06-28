package com.fundamental.java;

public class SUVChild extends TruckClass{

    private String backRoofing;

    public SUVChild() {

        System.out.println("SUV option with a Back Roof Coverage fee");
    }
    public SUVChild (String backRoofing){
        this.backRoofing = backRoofing;

    }
    public void coveredStorage() {
        System.out.println("Protects back spot from the outside");
    }
    //child class overriding the printed message that was given from the parent class
    @Override
    public void Drive() {
        System.out.println("Drive by the Soccer Fields");

    }
    public String getbackRoofing(){
        return backRoofing;
    }
    public void setbackRoofing (String backRoofing){
        this.backRoofing = backRoofing;

    }
}


