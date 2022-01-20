package com.core.learning;

public class MinMaxElementInArray {
    public static void main(String[] args) {
        int [] array = {101,2,3,4,6,5,2,1,0,-1};
        int min=2147483647; // An integer's max range
        int max=0;
        for (int i=0; i<array.length; i++){
            if(array[i]>max){   // min=0
                max = array[i]; // max=2,3,4
            }
            if(array[i] < min){ //
                min = array[i]; //
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}