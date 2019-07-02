package com.fundamental.java;
//This class is used for Lesson16 content and Enumercation
public class Lesson16 {

    public enum IceFlavors {VANILLA,COCO,BERRY,ROCKY,}

    public void showEnum(){
        DaysOfTheWeek dl = DaysOfTheWeek.TUE;
        System.out.println(dl);
        System.out.println(IceFlavors.ROCKY);
        System.out.println(DaysOfTheWeek.THUR);
    }//end method
    public void myFavoriteFlavor(IceFlavors flavors){
        String message = "My favorite flavor is ";
        switch(flavors){
            case VANILLA:
                message += "Vanilla";
            break;
            case COCO:
                message += "Coco";
            break;
            case BERRY:
                message += "Berry";
            break;
            case ROCKY:
                message += "Rocky";
            break;
            default:
        message += "Additional the Flavor";
        break;
        }
        System.out.println(message);
    }
}
