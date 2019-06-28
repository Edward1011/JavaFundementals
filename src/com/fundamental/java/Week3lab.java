package com.fundamental.java;

public class Week3lab {

        public void gradeNumber(){
            char Grade = ''; //<< Type in Any of the Grade Letters to get the print out, non grade value any other letter
            switch (Grade) {

                case 'E':
                    System.out.println("Excellent");
                    break;
                case 'V':
                    System.out.println("Very Good");
                    break;
                case 'G':
                    System.out.println("Good");
                    break;
                case 'A':
                    System.out.println("Average");
                    break;
                case 'F':
                    System.out.println("Failure");
                    break;
                default:
                    System.out.println("Not applicaple Grade Value");
                    break;
                    //Prints out the applicaple grade value so long as it matches one of the true grade letters




            }
        }
public void divisionNumber() {
            int EndLine = 0;
            do{
                if (EndLine / 3 == 0) {
                    System.out.println(EndLine);
                }
                EndLine++;
            } while (EndLine < 50);
   /* public void basicDoWhileExample() {
        int today = 0;
        do {
            if (today % 2 == 0) {
                System.out.println(today);
            }
            today++;
        } while (today < 30);*/
    }

}
