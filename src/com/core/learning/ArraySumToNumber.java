package com.core.learning;

public class ArraySumToNumber {
    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
    // sum({13, 43, 2, 71}, 84) -> {13, 71}


    //TODO
    public int [] sum(int [] array, int number){
        int n = array.length-1;
        for (int i = 0, j = 0 ; i < array.length-1 | j < array.length-1; i++, j++) {
            int sum = array[i] + array[j];
            if(sum == number && i != j){
                return  new int [] {array[i],array[j]};
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        ArraySumToNumber obj = new ArraySumToNumber();
        int [] array = {1, 2, 3, 5};
        int [] outPut = obj.sum(array,4);
        for (int i = 0; i < outPut.length; i++) {
            System.out.println(outPut[i]);
        }
    }
}
