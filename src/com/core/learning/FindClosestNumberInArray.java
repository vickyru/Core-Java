package com.core.learning;

import java.util.Arrays;

public class FindClosestNumberInArray {
    /**
     * Input : arr[] = {1, 2, 4, 5, 6, 6, 8, 9}
     * Target number = 11
     * Output : 9
     * 9 is closest to 11 in given array
     * <p>
     * Input :arr[] = {2, 5, 6, 7, 8, 8, 9};
     * Target number = 4
     * Output : 5
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 6, 8, 9};
        int number =11;
        int diff= Integer.MIN_VALUE;
        int temp = Integer.MAX_VALUE;
        int index = 0;
        for (int i=0; i<array.length;i++){
            diff = array[i] - number;
            if(diff<0){
                diff = diff * -1;
            }
            if(diff<temp){
                temp=diff;
                index = i;
            }
        }
        System.out.println(array[index]);
    }
}
