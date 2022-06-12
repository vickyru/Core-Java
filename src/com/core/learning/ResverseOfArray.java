package com.core.learning;

import java.util.Arrays;

public class ResverseOfArray {
    // revArr({1, 2, 3, 4, 5}) -> {5, 4, 3, 2, 1}
    // revArr({1})             -> {1}
    // revArr({1, 2, 3})       -> {3, 2, 1}
    public static void main(String[] args) {
        int array[]= {1,2,3 ,4};
        int j = array.length-1;
        for (int i=0; i<(array.length/2);i++){
            int temp = array[i];
            array[i] = array[j-i];
            array[j-i] = temp;
        }
        for (int i : array) {
            System.out.print(i);
        }
    }
}
