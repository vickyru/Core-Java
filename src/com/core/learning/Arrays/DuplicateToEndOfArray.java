package com.core.learning.Arrays;

import java.util.Arrays;

/**
 * {1,2,3,1,4,5} => {1,2,3,4,5,1}
 * {1,2,3,1,4,5,2} => {1,2,3,4,5,1,2}
 */
public class DuplicateToEndOfArray {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,1,4,5};
        int n = intArray.length -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if(intArray[j] < intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        for (int num : intArray) {
            System.out.print(num);
        }
    }
}
