package com.core.learning.min_max;

import java.util.*;

/*
    Find the second largest in an ARRAY
 */
public class SecondLargest {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5,6};
        int[] array = {4,3,1,2,6,5};
        Arrays.sort(array);
        int firstLargest=0, secondLargest=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
        }
        System.out.println("First Largest is: " + firstLargest);
        System.out.println("Second Largest is: " + secondLargest);
    }
}
