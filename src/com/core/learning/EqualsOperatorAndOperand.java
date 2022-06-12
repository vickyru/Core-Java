package com.core.learning;

public class EqualsOperatorAndOperand {
    public static void main(String[] args) {
        String s1= "Apple";
        String s2 = "Apple";
        String str1 = new String("India");
        String str2 = new String("India");

        // First string pool
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        // String Object
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
