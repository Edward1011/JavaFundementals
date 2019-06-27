package com.fundamental.java;

public class Bottles_Of_Beer_Song {
    // This class demostrates control flow using a song :)

private void lesson10private(){
    //try to see private
    System.out.println("This is a private message");
}
            public void timeToSing() {
        int bottlesOfBeer = 5;
        String word = "Bottles", results= "";

        while(bottlesOfBeer > 0) {
            if (bottlesOfBeer == 1) {
                word = "bottle";
            }// end if
            System.out.println(bottlesOfBeer + " " + word + " of Beer on the Wall");
            System.out.println(bottlesOfBeer + " " + word + " Of Beer");
            System.out.println("Take one down");
            System.out.println("Pass it out");
            bottlesOfBeer--;

            if (bottlesOfBeer > 0) {
                System.out.println(bottlesOfBeer + " " + word + " of Beer on the Wall");
            } else {
        System.out.println("No more Bottles of Beer on the wall!");
            }

                }// end while


            }
}



