package com.core.learning.min_max;

import org.omg.CORBA.INTERNAL;

public class SecondMaxInArray {
    public static void main(String[] args) {
        //Find index of max number
        int [] array = {67,23,4,12,76,34,33,65,89,102};
        int max = array[0];
        int maxIndex=0;
        for (int i=0; i<array.length;i++){
            if(max<array[i]){
                max = array[i];
                maxIndex =i;
            }
        }
        // Then find max again
        int secMax= array[0];
        for(int i=0;i<array.length;i++){
            if(i != maxIndex && secMax < array[i]){
                secMax = array[i];
            }
        }
        System.out.println("SecMax: " + secMax);
    }
}
