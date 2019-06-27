package com.fundamental.java;
/*
TheContents of this class is for lesson 9 : Arrays
*/
public class Lesson9 {

    public void basicIntArray() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }// the end of loop
    }//end method


    public void basicStringArray() {
        String[] stringArray = new String[9];
        stringArray[0] = "sunday";
        stringArray[1] = "monday";
        stringArray[2] = "happy days";
        stringArray[3] = "tuesday";
        stringArray[4] = "wensday";
        stringArray[5] = "happy days";
        stringArray[6] = "thursday";
        stringArray[7] = "friday";
        stringArray[8] = "happy days";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }//end foward

    }//end method

    public void basicTwodimensionalarray() {
        int[][] myArray = {{23, 32}, {13, 31}, {46, 64}};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[j].length; j++) {
                System.out.println(myArray[i][j]);
            }
        }// end for loop
    }//end method

    ////int[][][] arr = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };
    public void basicThreedimensionalarray() {
        int[][][] threeArray = new int[2][2][2];
        threeArray[0][0][0] = 10;
        threeArray[0][1][0] = 11;
        threeArray[0][0][1] = 12;
        threeArray[0][1][1] = 13;

        threeArray[1][0][0] = 14;
        threeArray[1][1][0] = 15;
        threeArray[1][1][0] = 16;
        threeArray[1][0][1] = 17;

        for (int i = 0; i < threeArray.length; i++) {
            for (int j = 0; j < threeArray[i].length; j++) {
                for (int k = 0; k < threeArray[j].length; k++) {
                    System.out.println(threeArray[i][j][k]);
                }// end inner// inner for loop
            }// end inner for loop
        }// end outer for loop

    }//end method
    public void basicJaggedArray() {
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "Jun";
        stringArray[0][1] ="Jul";
        stringArray[0][2] = "Aug";
        for(int i =0;i <stringArray.length; i++){
            for(int j = 0;j<stringArray[i].length; j++){
                System.out.println(stringArray[i][j]);

            }
        }
}//end method

    }// end class


