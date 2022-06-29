package com.core.learning.reverse;

public class ReverseStringWOStringMethods {
    public static void main(String[] args) {
        String str = "Madam";
        // Using reverse loop
        char[] ch= str.toCharArray();
        for (int j=ch.length-1;j>=0;j--){
            System.out.print(ch[j]);
        }
    }
}
