package com.fundamental.java;

    public class Condo extends House {

        private String balcony;

        public Condo() {

        System.out.println("Default constructor");
    }
public Condo(String balcony) {
            this.balcony = balcony;
}

public Condo (String balcony,String doorColor, int windowSize, String foundation, String roofType){
            super(doorColor,windowSize,foundation, roofType);
            this.balcony = balcony;
}

        public void maintenance(){
            System.out.println("Will fix condo issues");
        }

        public String getBalcony() {
            return balcony;
        }

        public void setBalcony(String balcony) {
            this.balcony = balcony;
        }
        public void doorOpenClose() {
            System.out.println ("My condo door is open");
        }
    }

