package com.fundamental.java;
import java.util.*;
/*The java util.*shouldn't be used in favor of individual imports to memory limitations.
 You don't need imports of classes that you will never use., but load separatly.*/


//This class goes over Lesson 17 content,Collections framework.
public class Lesson17 {

    public void exampleArrayList1() {
        List<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Tuesday");
        list.add("Not Monday,");
        list.add("Where\'s Friday");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }//end method

    public void exampleArrayList2() {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(42);
        myList.add(103);
        myList.add(3);

        //For loop version
        /*for(int value = 0; value < myList.size(); value ++) {
    System.out.println(myList.get(value));*/

        //foreach
        for (Integer integer : myList) {
            System.out.println(integer);

        }
    }

    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Fire");
        myHash.add("Sparks");
        myHash.add("Mountains");
        myHash.add("Mountains");

        Iterator<String> myIterate = myHash.iterator();
        while (myIterate.hasNext()) {
            System.out.println(myIterate.next());
        }

    }// end method

    public void exampleHashMap() {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(10,"Happy");
        myMap.put(20,"Java");
        myMap.put(30,"Brew");

       for(Map.Entry<Integer, String> map: myMap.entrySet()) {
           System.out.println(map.getKey() + " = " + map.getValue());
        }

    }
}//ending class :<
