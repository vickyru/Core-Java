package com.core.learning.duplicates;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDuplicateWithoutCollection {
    public static void main(String[] args) {
        int [] array = {1,3,2,5,6,2,7,12,10,10};
        for(int i=0; i<array.length; i++){ // complexity O(n)
            for(int j=i+1; j<array.length; j++){    // O(n*n)
                if(array[j] == array [i]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
