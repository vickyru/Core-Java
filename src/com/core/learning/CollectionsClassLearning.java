package com.core.learning;

import java.util.*;

public class CollectionsClassLearning {
    public static void main(String[] args) {
        //Write a Java program to create a new array list, add some colors (string) and print out the collection. Go to the editor
        List<String> colourList = new ArrayList<String>();
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Orange");
        colourList.add("Orange");
        System.out.println("List => " + colourList);
        // Iterator
        for (String numbers:colourList) {
            System.out.println(numbers);
        }
        // sort
        Collections.sort(colourList);
        System.out.println("Sorted List => " + colourList);
        // Remove duplicate
        Set removeDuplicate= new HashSet(colourList);
        System.out.println("Duplicate removed from the List => " + removeDuplicate);
        // Iterator example
        Iterator it = colourList.iterator();
        while (it.hasNext()){
            System.out.println("Iterator => " + it.next());
        }
//        // ListIterator
//        ListIterator lit = colourList.listIterator(colourList.size());
//        while (lit.hasPrevious()){
//            System.out.println("ListIteartor: " + lit.previous());
//            if (lit.previous() == "Orange"){
//                lit.remove();
//            }
//        }

        // removeif method uses
        System.out.println("Before Removing Orange" + colourList);
        colourList.removeIf(color -> color=="Orange");
        System.out.println("Removed Orange" + colourList);

        Set<Integer> numberSet = new HashSet<Integer>();
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(2);
        numberSet.add(2);
        System.out.println("Set => " + numberSet);

        System.out.println(20>15?true:false);


    }
}
