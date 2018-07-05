package com.gfg.guava;

import com.google.common.collect.*;
import org.testng.collections.Sets;

public class GuavaCollections {

    public static void main(String[] args){

        //multiSet();
        multiMap();
    }

    public static void multiMap(){
        Multimap<String, String> myMultimap = TreeMultimap.create();

        // Adding some key/value
        myMultimap.put("Fruits", "Bannana");
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        System.out.println(myMultimap.get("Fruits"));
        //System.out.println(myMultimap.entries().iterator().next().getKey());
        //System.out.println(myMultimap.entries().iterator().next().getValue());
        //System.out.println(myMultimap.containsValue("Banana"));

    }

    public static void multiSet(){

        Multiset<String> multiset = TreeMultiset.create();
        multiset.add("Sourabh");
        multiset.add("Sateesh");
        multiset.add("Anubhava");
        multiset.add("Sourabh");
        multiset.add("Sourabh");

        System.out.println(multiset.count("Sourabh"));
        System.out.println(multiset.elementSet());
    }
}
