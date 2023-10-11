package com.core.learning.Arrays;

import java.util.Arrays;

public class RemoveDuplicateInArray {

    private void method1(){
        int [] intArray = {1,3,5,7,2,4,6,1,2,4,5,};
        // Not applicable to string array
        int [] arr = Arrays.stream(intArray).distinct().toArray();
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        RemoveDuplicateInArray obj = new RemoveDuplicateInArray();
        obj.method1();
    }
}
