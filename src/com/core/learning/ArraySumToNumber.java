package com.core.learning;

public class ArraySumToNumber {
    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
    // sum({13, 43, 2, 71}, 84) -> {13, 71}


    //TODO
    public int [] sum(int [] array, int number){
        int n = array.length-1;
        for (int i = 0; i < array.length; i++) {
            int sum = array[i] + array[n-i];
            if(sum == number){
                return  new int [] {array[i],array[n-i]};
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        ArraySumToNumber obj = new ArraySumToNumber();
        int [] array = {1, 2, 3, 5};
        System.out.println(obj.sum(array,4));
    }
}
