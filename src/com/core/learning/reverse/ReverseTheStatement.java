package com.core.learning.reverse;

public class ReverseTheStatement {
    // revWords("apple banana kiwi") -> "kiwi banana apple"
    // revWords("I am John Doe")     -> "Doe John am I"
    // revWords("orange")            -> "orange"
    public static void main(String[] args) {
        String str = "apple banana kiwi";
        StringBuilder newStr = new StringBuilder();
        String [] array = str.split(" ");
        for (int i=array.length-1;i>=0;i--){
            newStr.append(array[i] + " ");
        }
        System.out.println(newStr);
    }
}
