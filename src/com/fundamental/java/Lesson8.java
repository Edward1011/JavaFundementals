package com.fundamental.java;
/*
 * The content of this class is to go over lesson 8 of content
 * control flow statement
 * */
public class Lesson8 {

    public void basicIfExample(int value1, int value2) {
        System.out.println("Before if Statement");
        if (value1 == value2) {
            System.out.println("Values are equal");
        }
        System.out.println("After if Statement");
    }

    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if (alpha != beta) {
            System.out.println("The value are not equal");
        } else {
            System.out.println("The values are equal");
        }
        System.out.println("End of if statement");
    }

    public void basicIfElseChainExample(int charlie) {
        if (charlie < 30) {
            System.out.println("The value is greater than 30");
        } else if (charlie < 40) {
            System.out.println("The value is greather than 30, but less than 40.");

        } else {
            System.out.println("The value is greater than 40");

        }
        System.out.println("End of it statement");
    }// end method


    public void basicIfAndOrExample(int delta) {
        System.out.println("Before if statement");
        if (delta > 100 || delta < 50) {
            System.out.println("The value is between 100 and 30");
        }
        if (delta % 2 == 0 && delta > 30) {
            System.out.println("The value is greater than and an even number");
        }
    }//end method

    public void basicSwitchExample(int day) {
        switch (day) {
            case 1:
                System.out.println("Day = 1");
                break;
            case 2:
                System.out.println("Day = 2");
                break;
            case 3:
            case 4:
                System.out.println("Day = 3 or 4");
                break;
            default:
                System.out.println("Day is greater than 4");
                break;
        }

    }// end method

    public void basicWhileExample() {
        int val = 0;
        while (val < 10) {
            System.out.println(val);
            val++;
        }

    }// end method

    public void basicDoWhileExample() {
        int today = 0;
        do {
            if (today % 2 == 0) {
                System.out.println(today);
            }
            today++;
        } while (today < 30);
    }//end method

    public void basicForLoopExample() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }// end method


    public void basicBranchExample() {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;

            }
            if (i == 4) {
                System.out.println("Loop breaks");
                break;

                }
            System.out.println(i);
                System.out.println("End of Loop");
            }// end method
        }// end class

    }


