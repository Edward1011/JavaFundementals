package com.fundamental.java;
/*The conteint of this class is for the lesson 6 slide deck,
 * strings and more.
 */

public class Lesson6 {
//String myString being used for this boolean, ="Lamar"; being True when typed in, any other triggers it false
    String myString = "Lamar";

    //The method shows String method for charAt here
    public void examplecharat() {
        char mychar = myString.charAt(2);
        System.out.println(mychar);

    }
//*question*
    public void exampleconcat(String value) {
        String happy = myString.concat(value);
        System.out.println(happy);

    }
//*question*
    public void examplesEquals(String Donut) {
        boolean myBoolean = myString.equals(Donut);
        System.out.println(myBoolean);


    }
//Lowercase and Upper case just highlights the words "either like this" or "EITHER LIKE THIS", depending on command
    public String exampleLowerCase() {
        return myString.toLowerCase();

    }

    public String exampleUpperCase() {
        return myString.toUpperCase();
    }

    public void examplelength() {
        int length = myString.length();
        System.out.println(length);
    }
//Using String Builder takes objects and puts them together
// Taking more than 2 strings together and able to modify them aswell.
    /*SAMPLE
    * public class Lesson7  {

    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        builder.append(“Happy”);
        builder.append(“ Hour “);
        builder.append(“ is almost “).append(“here!!!”);
        String value = builder.toString();
        System.out.println(value);
    }
}
*/
    public void exampleBuilder(String food, int value) {
        StringBuilder build = new StringBuilder();
        build.append("My favourite food is");
        build.append(food).append(" and i ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);
//build.append(food).append takes the (food)
//and inserts next to "and", as if ("My favourite food is") is leading to it
//value shows the number that was represented as the variable

    }
//All unicode may not work, incase you want to add your own
// Char c2 = '\u5FF8  shows it can print it out when run by using the unicode's letter code
//followed by System.out.println();   to print the runned word
    public void exampleChar() {
        char c1 = 'c';
        char c2 = '\u5FF8';
        System.out.println(c2);
    }
    //What we did here was experiment with "Escape Sequences
    /*For the line of text with quotations, there some commands to edit how the line of text is read or placed.
    * All of these use Back Slash
    *
    * \' simply to add single quote
    * \t Tabs in the text, "adding space" after running it
     *\n Acts as the Enter Key, which puts your text down a space. */
    public void exampleEscape() {
        System.out.println("That\'s a cool toy.\t Can I\n play with it?");
    }

}