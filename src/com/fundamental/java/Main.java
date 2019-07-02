package com.fundamental.java;
import com.fundamental.lesson10.Lesson10;
/*
this class is the starting class of this project
this is on example of split -line comment-

 */


public class Main {

    public static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    }

    static {

            System.out.println("Static block 2");
            num=62;
}

    //Which tabs to direct information from as you run the code, for my case "Off and on switch"
    public static void main(String[] args) {
          lesson17Example();
        //lesson16Example();
        //lesson15Example();
        //lesson14Example();
        //Week3lab();
        //Lesson12example();
        //TruckClassexample();
        //lesson11Example();
        //lesson10Example();
        //Lesson9Example();
        //beersong();
        //lesson8Example2();
        //lesson8Example1();
        //Week2labfun();
        //Lesson7Examples();
        //moreLesson6();
        //lesson6examples();
        //lesson5examples();
        //houseExample();
    }// end reached

    public static void lesson17Example() {
        Lesson17 myLesson17= new Lesson17();
        //myLesson17.exampleArrayList1();
        //myLesson17.exampleArrayList2();
        //myLesson17.exampleHashSet();
        myLesson17.exampleHashMap();
    }

    public static void lesson16Example() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();

        myLesson16.myFavoriteFlavor(Lesson16.IceFlavors.BERRY);
        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for (DaysOfTheWeek day : d1) {
            System.out.println(day +" at index "+day.ordinal());
        }
    }
    /*public static void lesson15Example(){
        int[] myKeys = {0,1,2,3,4,5,6,7,8,9};
        BlackBerry myBlackBerry = new BlackBerry(23,myKeys,0,"Color Screen");
        myBlackBerry.receiveCall();
        AbstractCellphone myOldPhone = new BlackBerry(30,myKeys,1, "Monochrome");
        myOldPhone.receiveCall();
        myOldPhone.endCall();

    }//end method
                             */
    public static void Lesson12example(){
        Condo myCondo = new Condo ();
    myCondo.doorOpenClose();
    Condo mySecondCondo = new Condo ("Railing","Orange",32,"Hunter Green","Steel");
    System.out.println(mySecondCondo.getDoorColor());
    }
//House myHouse = new Condo
    public static void TruckClassexample() {
        TruckClass myTruckClass = new TruckClass("Seamless", 6 , "ToolBox", "Yellow");
        myTruckClass.setColorTexture ("Magenta");
        System.out.println(myTruckClass.getWheelsTexture());
        System.out.println(myTruckClass.getBoxBedType());
        System.out.println(myTruckClass.getWindowsSize());
        System.out.println(myTruckClass.getColorTexture());
    }

    public static void lesson11Example() {
House house1= new House();

House house2 = new House( "Beer Bottle Brown");

TruckClass TruckClass1 = new TruckClass();
    }
public static void lesson14Example() {
        //Lesson14.MY_FIRST_FINAL_ = 10;
    // *Cannot change value of final* -When red-
    int total = Lesson14.MY_FIRST_FINAL * 35; //2019 * 35
    System.out.println (total);

    //Can change the value of a non final static
    Lesson14.myFirstStatic = 90; // original is 35
    System.out.println(Lesson14.myFirstStatic);

    Lesson14.myfirstStaticMethod(10);
    System.out.println("Block number was "+num);
    
    Lesson14.MyInnerMethod test = new Lesson14.MyInnerMethod();

}
    public static void lesson10Example() {
        //trying to see private method inside another class
Lesson6 myLesson6 = new Lesson6();
        //myLesson6.exampleprivate(); //Cannot Access

    Bottles_Of_Beer_Song song = new Bottles_Of_Beer_Song();
    //song.lesson10private();
    //song is privated
}   Lesson10 myLesson = new Lesson10();
    //myLesson.showProtected(); //cannot access




    public static void Lesson9Example(){
        Lesson9 myLesson9 = new Lesson9();
        //myLesson9.basicIntArray();
        //myLesson9.basicStringArray();
        //myLesson9.basicTwodimensionalarray();
        //myLesson9.basicThreedimensionalarray();
        //myLesson9.basicJaggedArray();
    }

    public static void beersong() {
        Bottles_Of_Beer_Song song = new Bottles_Of_Beer_Song();
        song.timeToSing();
    }



    public static void lesson8Example2() {
Lesson8 otherLesson = new Lesson8();
otherLesson.basicWhileExample();
otherLesson.basicDoWhileExample();
otherLesson.basicForLoopExample();
otherLesson.basicBranchExample();
    }
public static void lesson8Example1() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,10); //prints before, and then after
    myLesson8.basicIfExample (5,5);     //prints before, then If & after
    myLesson8.basicIfElseExample(10, 11);//not Equal Statement
    myLesson8.basicIfElseExample(1,1); //Equal statement
    myLesson8.basicIfElseChainExample(42);
    myLesson8.basicIfAndOrExample( 30);
    myLesson8.basicSwitchExample(3);// set up before was 3 or 4. if over value goes to final result

}

    public static void Lesson7Examples() {

        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.examplemodulus();
        myLesson7.addTwoNumbers();
        myLesson7.exampleAssingment();
        myLesson7.exampleAssingment2();
        myLesson7.exampleRelational();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();

    }


public static void Week2labfun(){
        Week2lab lab2= new Week2lab();
        lab2.voltage();

}
public static void Week3lab() {
    Week3lab myWeek3lab = new Week3lab();
    myWeek3lab.gradeNumber();
    myWeek3lab.divisionNumber();



}


//food and value being variables pulled into another paragraph of code
public static void moreLesson6() {
    Lesson6 myOtherLesson6 = new Lesson6();
            myOtherLesson6.exampleBuilder(" bread", 2);
            myOtherLesson6.exampleChar();
            myOtherLesson6.exampleEscape();

} // Value: being the text presented with (Donut:"Lamar");
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



















