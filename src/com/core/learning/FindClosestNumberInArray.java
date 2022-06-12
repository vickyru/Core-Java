package com.core.learning;

public class FindClosestNumberInArray {
    /**
     * Input : arr[] = {1, 2, 4, 5, 6, 6, 8, 9}
     *              Target number = 11
     * Output : 9
     * 9 is closest to 11 in given array
     *
     * Input :arr[] = {2, 5, 6, 7, 8, 8, 9};
     *        Target number = 4
     * Output : 5
     */

    public static void main(String[] args) {
        int [] array = {1, 2, 4, 5, 6, 6, 8, 9};
        int number = 2;
        int endIndex = array.length-1;
        int startIndex = 0;
        int mid = 0;
        while (startIndex < endIndex-1){
            mid=(endIndex+startIndex)/2;
            System.out.println("start index: " + startIndex);
            System.out.println("end index: " + endIndex);
            System.out.println("mid index: " + mid);
            if(number-array[startIndex] > number-array[endIndex]){
                startIndex=mid;
            }
            if(number-array[startIndex] < number-array[endIndex]){
                endIndex = mid;
            }
        }
        System.out.println(array[mid+1]);
    }
}
