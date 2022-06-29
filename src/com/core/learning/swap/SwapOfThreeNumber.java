package com.core.learning.swap;

public class SwapOfThreeNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c =30;

        a = a + b + c;  // a=60
        b = a - (b + c); // 60 - (20+30) => b = 10
        c = a - (b + c); // 60 - (10+30) => c = 20
        a = a - (b + c); // 60 - (10 +20) => a = 30

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
