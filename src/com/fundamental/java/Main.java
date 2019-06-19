package com.fundamental.java;
/*
this class is the starting class of this project
this is on example of split -line comment-

 */


public class Main {
//Which tabs to direct information from as you run the code, for my case "Off and on switch"
    public static void main(String[] args) {
        moreLesson6();
        //lesson6examples();
        //lesson5examples();
        //houseExample
    }
//food and value being variables pulled into another paragraph of code
public static void moreLesson6() {
    Lesson6 myOtherLesson6 = new Lesson6();
            myOtherLesson6.exampleBuilder(" bread", 2);
            myOtherLesson6.exampleChar();
            myOtherLesson6.exampleEscape();

} // value: *Unsure
    //"Donut": Lamar being the True statement
    public static void lesson6examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.examplecharat();
        myLesson6.exampleconcat(" has alright donuts");
        myLesson6.examplesEquals("Lamar");
        String myLower = myLesson6.exampleLowerCase();
        System.out.println(myLower);
        String myUpper = myLesson6.exampleUpperCase();
        System.out.println(myUpper);
        myLesson6.examplelength();
    }






        public static void lesson5examples(){
            Lesson5 mylesson5 = new Lesson5();
            mylesson5.showlocalexample();
            mylesson5.showlocalwithparameter(10, 12);
            int example = mylesson5.showlocalwithreturn(15, 8);
            System.out.println(example);
            mylesson5.showinstancevariable();
            mylesson5.showConversion();
        }

        public static void houseExample () {
            System.out.println("Welcome to Java");
            House myHouse = new House();
            myHouse.doorOpenClose();


        }

    }

