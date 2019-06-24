package com.fundamental.java;
import java.util.Scanner;
// This is lesson 7 we will go over called Java Operators.
public class Lesson7{
//Math basics, X = 23, Y = 45. using the math symbols with plugging in X "-+/*" Y = Z
        int value1 = 23, value2 =45;

        public void basicMath() {
            int addTotal = value2 + value1;
            int subtractTotal= value2 - value1;
            int multiplyTotal = value1 * value2;
            int divisionTotal = value1 / value2;
            System.out.println(addTotal);
            System.out.println(subtractTotal);
            System.out.println(multiplyTotal);
            System.out.println(divisionTotal);
        }

        public void examplemodulus() {
            int modulusTotal = value1 % value2;
        System.out.println(modulusTotal);

        }
//"Sorta like a calculator"
        public void addTwoNumbers() {
            int x, y, z;
            System.out.println("Enter two intergers to calculate that sum.");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            y = in.nextInt();
            z = x + y;
            System.out.println("The sum of entered value ="+z);

        }
//X = 10, Y = 15, general plugging variables with different symbols to see results carried over
        public void exampleAssingment() {
            int able = 10, may = 15;
            able += may;
            System.out.println(able);
            may -= able;
            System.out.println(may);
            able *= may;
            System.out.println (able);
            able /= may;
            System.out.println(able);
            may %= able;
            System.out.println(may);

        }
/*
* = assigns value + adds, - subtracts, * multiply, / divides,% modulus, Operands to the left..
* ..<<= left shift, >>= right shift &= Bitwise,exclusive assignment operator..
*   ..^= Bitwise either of these two.
 * all right to left
 * C = A + B exception
*C = C "*" A          *any assigned symbol above listed

 * */

        public void exampleAssingment2(){
            int beta = 10, charlie = 5;
            beta <<= charlie;
                    System.out.println(beta);
            charlie >>= beta;
            System.out.println(charlie);
            beta &= charlie;
            System.out.println(beta);
            charlie ^= beta;
            System.out.println(charlie);
        }
//The symbols with boolean serve as a T or F question down here for example
        public void exampleRelational(){
            int echo = 25, fox = 30, rabbit = 25;
            boolean isSample1 = echo == fox;    //equal to?
            System.out.println(isSample1);
            boolean isSample2 = echo != fox;    //both equal?
            System.out.println(isSample2);
            boolean isActual = fox > rabbit;    //greater than?
            System.out.println(isActual);
            boolean isActual2 = fox < rabbit;   //Lesser than?
            System.out.println(isActual2);
            boolean isFamiliar = echo >= rabbit;//Greater than or equal?
            System.out.println(isFamiliar);
            boolean isFamiliar2 = fox <= echo;  //Lesser than or equal?
            System.out.println(isFamiliar2);

        }

        public void exampleIncrement() {
            int home=10, jump, car;
            jump = home++;  // 10
            System.out.println(jump);

            car = ++ home; //12
            System.out.println(car);


        }

        public void exampleDecrement() {
            int Troy = 10, Joe, Jerry;
            Joe = Troy--; //10
            System.out.println();

            Jerry = --Troy; //8
            System.out.println(Jerry);


        }
}


