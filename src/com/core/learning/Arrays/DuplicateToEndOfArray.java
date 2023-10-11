package com.core.learning.Arrays;

import java.util.*;

/**
 * {1,2,3,1,4,5} => {1,2,3,4,5,1}
 * {1,2,3,1,4,5,2} => {1,2,3,4,5,1,2}
 *  TODO
 */
public class DuplicateToEndOfArray {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,1,4,5,6,2,7,3};
        List<Integer> firstList = new ArrayList<Integer>();
        List<Integer> secondList = new ArrayList<Integer>();
        Set<Integer> integerSet = new HashSet<Integer>();
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if(!integerSet.add(intArray[i])){
                secondList.add(intArray[i]);
            }
        }
        List<Integer> fList = new ArrayList<>(integerSet);
        fList.addAll(secondList);
        for (int item :
                fList) {
            System.out.print(item + ",");

        }
    }
}
