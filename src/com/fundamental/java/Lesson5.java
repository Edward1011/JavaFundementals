package com.fundamental.java;
/*The content of this class is for the lesson 5 slide deck
Primitive Data Types & More*/

public class Lesson5 {

    //This is primitive type consists of true or false only
    boolean myBoolean = true;

    // This primitive type has a value range of -128 to 127
    byte mybyte = 9;

    // This primitive type has a value range of 0 to 65535
    char mychar = 'C';

    //This is primitive type has a value range of -32768 to 32767
    short myshort = 235;

    //This primitive type has a range of -2147483648 to 2147483647
    int myint = 23585;

    //This primitive type has a range of -9223372036854775808 to 9,223,372,036,854,775,807
    long mylong = 518489;

    //This primitive type value range varies
    float myfloat = 127f;

    // This primitive type value range varies
    double mydouble = 84.8d;
    double otherdouble = 46.25d;

    //decimal value of 26
    int value = 26;

    //Hexadecimal value of 26;
    int value2 = 0x1a;

    //Binary value of 26
    int value3 = 0b11010;

    double d1 = 123.4; // or 123.4d

    //using under scores to make the numbers readable
    long l2 = 4_456_897L;

    //This method shows a local variable
    public void showlocalexample() {


        int able = 20;
        System.out.println(able);
    }

    //Two perameters seperated by a comma
    public void showlocalwithparameter(int able, int vals) {
        int total = able + vals;
        System.out.println(total);

    }

    //Method shows instance variable that changes value inside the method
    public int showlocalwithreturn(int type1, int type2) {
        return type1 + type2;
    }

    public void showinstancevariable() {
        System.out.println("Before");
        System.out.println(mydouble);
        System.out.println("after");
        mydouble = 93.6; /*double mydouble = 84.8d; */
        System.out.println(mydouble);
    }
//method show implicit and explicit conversion
    public void showConversion() {

        long ll2 = myint;   //implicit or widening conversion
        int i5 = (int)mylong;   // explicit or narrowing conversion
        //int i10 = (int)12;        //explicit conversion overflow
        //System.out.println(i10);  //274,020,071
        int i20 = (int)mydouble;    //explicit or narrowing conversion
       System.out.println(i20);     //double value was 98.6




    }
}






