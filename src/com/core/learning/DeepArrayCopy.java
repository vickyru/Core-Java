package com.core.learning;

public class DeepArrayCopy {
    public static int[][] clone(int[][] input) {
        //TODO create a copy of all the elements in input and return to caller.
        return  java.util.Arrays.stream(input).map(el -> el.clone()).toArray($ -> input.clone());
    }

    public static void main(String[] args) {
        int[][] test = new int[1][];
        test[0] = new int[] {42};
        int[][] testClone = clone(test);
        System.out.println("test clone value is: " + testClone[0][0]);
    }
}