package com.fundamental.java;
/*
this class is the starting class of this project
this is on example of split -line comment-

 */


public class Main{

        public static void main(String[] args) {
            Lesson5Examples();
            //houseExample
        }


public static void Lesson5Examples() {
    Lesson5 mylesson5 = new Lesson5();
    mylesson5.showlocalexample();
    mylesson5.showlocalwithparameter(10,12);
    int example = mylesson5.showlocalwithreturn(15,8);
    System.out.println(example);
mylesson5.showinstancevariable();
mylesson5.showConversion();
}

public static void houseExample(){
        System.out.println("Welcome to Java");
        House myHouse=new House();
        myHouse.doorOpenClose();
        }

}
