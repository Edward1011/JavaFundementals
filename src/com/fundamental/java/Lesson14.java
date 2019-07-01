package com.fundamental.java;

//This lesson goes over  content Static Variable

public class Lesson14 {
    public static final     int MY_FIRST_FINAL = 2019;
    public static int myFirstStatic= 35;
    public static void myfirstStaticMethod( int num){
        int total = MY_FIRST_FINAL * num;
        System.out.println(total);

    }//End method

    public static class MyInnerMethod {

        public void myInnerMethod(){
            System.out.println(myFirstStatic);
        }
    }
}//end class
