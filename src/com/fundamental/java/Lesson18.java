package com.fundamental.java;

import java.util.IllegalFormatException;

//Content for Lesson 18 goes covering exception handling
public class Lesson18 {
    String myStringNull;

    public void exampleException(){
        try{
            System.out.println(myStringNull);
            System.out.println("Try Block ran");
        } catch (NullPointerException e){
            System.out.println("Null Exception thrown" + e.getMessage());
        }finally {
            System.out.println("Finally,                                                                                              block summoned");
        }
    }//end of method

    public void myArrayExpectation(){
        String[] names = {"Dave","Matt", "Jody"};
        String[] values = {"243333", "424444444","38543"};
        try {
    byte b = Byte.parseByte(names[1]);
    System.out.println(b);
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        }catch(NumberFormatException ed) {
            System.out.println("That is not a number");
        }catch(StackOverflowError e) {
            System.out.println("You have given me more than a byte");
        }catch(Exception ea){
            System.out.println("I dunno what you did");

        }
    }

}//ending of class
