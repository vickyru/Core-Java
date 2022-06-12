package com.core.learning;

public class MaxNumInArray {
    public static void main(String[] args) {
        int [] array = {4,2,7,12,5,60};
        int max = array[0];
        for (int i=0; i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
    }
}
